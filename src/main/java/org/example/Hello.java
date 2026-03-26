package org.example;

public class Hello {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String name = "";
        for(int i=0; i < args.length; i++){
            sb.append(args[i]);
            if(i < args.length - 1) {
                sb.append(", ");
            }
            name = sb.toString();
        }
        System.out.println(name);
    }
}
