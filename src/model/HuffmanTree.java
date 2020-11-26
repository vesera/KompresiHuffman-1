/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dave Septian
 */
public class HuffmanTree {
    int occurance;
    char karakter;
    HuffmanTree left;
    HuffmanTree right;

    public HuffmanTree(int occurance,char karakter, HuffmanTree left, HuffmanTree right) {
        this.occurance = occurance;
        this.karakter = karakter;
        this.left = left;
        this.right = right;
    }


    public int getOccurance() {
        return occurance;
    }

    public void setOccurance(int occurance) {
        this.occurance = occurance;
    }

    public char getKarakter() {
        return karakter;
    }

    public void setKarakter(char karakter) {
        this.karakter = karakter;
    }

    public HuffmanTree getLeft() {
        return left;
    }

    public void setLeft(HuffmanTree left) {
        this.left = left;
    }

    public HuffmanTree getRight() {
        return right;
    }

    public void setRight(HuffmanTree right) {
        this.right = right;
    }
    
    
}
