package beecrowd2;

import java.util.Scanner;

public class Uri1049 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo1 = teclado.next();
        String tipo2 = teclado.next();
        String tipo3 = teclado.next();
        if (tipo1.equals("vertebrado")) {
            if (tipo2.equals("ave")) {
                if (tipo3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    if (tipo3.equals("onivoro")) {
                        System.out.println("pomba");
                    }
                }
            } else {
                if (tipo2.equals("mamifero")) {
                    if (tipo3.equals("onivoro")) {
                        System.out.println("homem");
                    } else {
                        if (tipo3.equals("herbivoro")) {
                            System.out.println("vaca");
                        }
                    }
                }
            }
        } else {
            if (tipo1.equals("invertebrado")) {
                if (tipo2.equals("inseto")) {
                    if (tipo3.equals("hematofago")) {
                        System.out.println("pulga");
                    } else {
                        if (tipo3.equals("herbivoro")) {
                            System.out.println("largato");
                        }
                    }
                } else {
                    if (tipo2.equals("anelideo")) {
                        if (tipo3.equals("hetamofago")) {
                            System.out.println("sanguessuga");
                        } else {
                            if (tipo3.equals("onivoro")) {
                                System.out.println("minhoca");
                            }
                        }
                    }
                }
            }
        }

        teclado.close();
    }
}
