/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektas1;

/**
 *
 * @author krist
 */
public class GameOfLife {
        public static void main(String[] args) {
        int lifeCycles = 50;
        int size = 4;
        char[][] field = new char[size][size];
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                if (Math.random() < 0.25) {
                    field[y][x] = 'X';
                } else {
                    field[y][x] = '.';
                }
            }
        }
//        char[][] field = {
//            {'.', '.', '.', '.'},
//            {'.', 'X', 'X', 'X'},
//            {'.', '.', '.', '.'},
//            {'.', '.', '.', '.'}
//        };
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                System.out.print(field[y][x]);
            }
            System.out.println();
        }
        System.out.println("0--------------------");

        for (int i = 1; i <= lifeCycles; i++) {
            char[][] newField = new char[size][size];
            for (int y = 0; y < field.length; y++) {
                for (int x = 0; x < field[y].length; x++) {
                    int nc = 0;
                    if (y > 0) {
                        nc += (x > 0 && field[y - 1][x - 1] == 'X') ? 1 : 0;
                        nc += (field[y - 1][x] == 'X') ? 1 : 0;
                        nc += (x < field[y].length - 1 && field[y - 1][x + 1] == 'X') ? 1 : 0;
                    }
                    nc += (x > 0 && field[y][x - 1] == 'X') ? 1 : 0;
                    nc += (x < field[y].length - 1 && field[y][x + 1] == 'X') ? 1 : 0;
                    if (y < field.length - 1) {
                        nc += (x > 0 && field[y + 1][x - 1] == 'X') ? 1 : 0;
                        nc += (field[y + 1][x] == 'X') ? 1 : 0;
                        nc += (x < field[y].length - 1 && field[y + 1][x + 1] == 'X') ? 1 : 0;
                    }
                    if (field[y][x] == 'X') {
                        if (nc == 2 || nc == 3) {
                            newField[y][x] = 'X';
                        } else {
                            newField[y][x] = '.';
                        }
                    } else {
                        if (nc == 3) {
                            newField[y][x] = 'X';
                        } else {
                            newField[y][x] = '.';
                        }
                    }
                }
            }
            boolean same = true;
            for (int y = 0; same && y < field.length; y++) {
                for (int x = 0; same && x < field[y].length; x++) {
                    if (field[y][x] != newField[y][x]) {
                        same = false;
                    }
                }
            }
            if (same) {
                System.out.println("Iteration repeat");
                break;
            }
            field = newField;
            for (int y = 0; y < field.length; y++) {
                for (int x = 0; x < field[y].length; x++) {
                    System.out.print(field[y][x]);
                }
                System.out.println();
            }
            System.out.println(i + "--------------------");
        }
    }

}
