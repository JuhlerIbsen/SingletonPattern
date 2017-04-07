/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author micha
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    /**
     * Private constructor cannot be reached from outsite.
     */
    private SingleObject() {

    }

    /**
     * Get the instance of SingleObject.
     *
     * @return instance of this object.
     */
    public static SingleObject getInstance() {
        return instance;
    }

    /**
     * Show a message..
     */
    public void showMessage() {
        System.out.println("Singleton are fun!");
    }
}
