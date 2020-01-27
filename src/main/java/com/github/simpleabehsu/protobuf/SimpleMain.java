package com.github.simpleabehsu.protobuf;

import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SimpleMain {
    public static void main(String[] args) {

//        System.out.println("Simple Message");
//
//        SimpleMessage.Builder builder = SimpleMessage.newBuilder();
//
//        builder.setName("Abe")
//                .setId(11)
//                .setIsSimple(true);
//
//        SimpleMessage message = builder.build();
//        System.out.println(message);
//
//        //output to binary
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("simple_message.bin");
//            message.writeTo(fileOutputStream);
//            fileOutputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileInputStream fileInputStream = new FileInputStream("simple_message.bin");
            SimpleMessage message2 = SimpleMessage.parseFrom(fileInputStream);
            fileInputStream.close();
            System.out.println(message2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            String simpleMessageString = JsonFormat
//                    .printer()
//                    .includingDefaultValueFields()
//                    .print(message);
//            System.out.println(simpleMessageString);
//        } catch (InvalidProtocolBufferException e) {
//            e.printStackTrace();
//        }




    }
}
