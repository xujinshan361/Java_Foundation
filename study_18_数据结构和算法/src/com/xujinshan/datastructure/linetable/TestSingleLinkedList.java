����   6 3  )com/xujinshan/io/test04/commons/CIOTest05  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this +Lcom/xujinshan/io/test04/commons/CIOTest05; main ([Ljava/lang/String;)V 
Exceptions  java/io/IOException  java/net/URL  http://www.163.com
     (Ljava/lang/String;)V  gbk
    org/apache/commons/io/IOUtils   ! toString 4(Ljava/net/URL;Ljava/lang/String;)Ljava/lang/String;	 # % $ java/lang/System & ' out Ljava/io/PrintStream;
 ) + * java/io/PrintStream ,  println args [Ljava/lang/String; datas Ljava/lang/String; 
SourceFile CIOTest05.java !               /     *� �    
                    	             S     � Y� � L� "+� (�    
                    - .     / 0   1    2                                                                                                                                                                          em.out.println(list.toString());
//		System.out.println(list.toString());
//		System.out.println(list.remove(2));
//		System.out.println(list.toString());
//		System.out.println(list.remove("678"));
		System.out.println(list.toString());
		System.out.println(list.replace(1, 100));      //这里面索引从1开始，索引0表示的是头结点，不做存储数据操作
		System.out.println(list.toString());
	
	}
}
