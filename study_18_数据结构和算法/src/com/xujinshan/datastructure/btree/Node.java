����   6 �  'com/xujinshan/mycollection/StuHashMap02  java/lang/Object table #[Lcom/xujinshan/mycollection/Node2; size I <init> ()V Code
   	 
   com/xujinshan/mycollection/Node2	     LineNumberTable LocalVariableTable this )Lcom/xujinshan/mycollection/StuHashMap02; put '(Ljava/lang/Object;Ljava/lang/Object;)V
  
     hashCode ()I
      myHash (II)I	  " #  hash	  % & ' key Ljava/lang/Object;	  ) * ' value	  , - . next "Lcom/xujinshan/mycollection/Node2;	  0  
  2 3 4 equals (Ljava/lang/Object;)Z newNode temp iterLast 	keyRepeat Z StackMapTable toString ()Ljava/lang/String; > java/lang/StringBuilder @ {
 = B 	 C (Ljava/lang/String;)V
 = 
 = F G H append -(Ljava/lang/Object;)Ljava/lang/StringBuilder; J :
 = L G M -(Ljava/lang/String;)Ljava/lang/StringBuilder; O ,
 = Q ; <
 = S T  length
 = V W X 	setCharAt (IC)V sb Ljava/lang/StringBuilder; i main ([Ljava/lang/String;)V
  
 ` b a java/lang/Integer c d valueOf (I)Ljava/lang/Int