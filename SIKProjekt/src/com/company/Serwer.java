package com.company;

import java.net.*;
import java.io.*;

public class Serwer {

    private static Game game = new Game();
    private ServerSocket serverSocket;

    public void start(int port) {
        int clients = 0;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ServerSocket error");
        }
        while (clients != 5) {
            try {
                new ClientHandler(serverSocket.accept()).start();
                clients++;
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ClientHandler error");
            }
        }
    }

    public void stop() {
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Server stop error");
        }
    }


    private static class ClientHandler extends Thread {
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;
        private String line;
        private String login;


        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IO Thread error");
            }

            try {
                out.println("POLACZONO");
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                line = in.readLine();
                if (line.startsWith("LOGIN")) {
                    String[] message = line.split(" ");
                    login = message[1];
                    game.addPlayer(login);
                    out.println("OK");
                } else {
                    out.println("ERROR");
                }

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Login error");
            }

            if (game.allReady()) {
                try {
                    out.println("START " + game.getIdByLogin(login) + " 1");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            game.setBoard();
            game.giveInfo();


            for (int turn = 1; turn <= 10; turn++) {
                for (int round = 1; round <= 100; round++) {

                    //waiting for turn

                    if (!game.players[game.getIdByLogin(login)].isEliminated()) {
                        try {
                            out.println("TWOJ RUCH");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        try {
                            line = in.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                            System.out.println("Read attack/pass error");
                        }

                        while (!line.equals("PASS")) {
                            if (line.startsWith("ATAK")) {
                                String[] msg = line.split(" ");
                                if (game.isAttackable(msg[1], msg[2], msg[3], msg[4])) {
                                    out.println("OK");
                                    String result;
                                    result = game.attack(msg[1], msg[2], msg[3], msg[4]);
                                    out.println(result);
                                } else {
                                    out.println("ERROR");
                                }
                            }
                        }
                    }
                }
            }

            in.close();
            out.close();
            clientSocket.close();
        }
    }
}
