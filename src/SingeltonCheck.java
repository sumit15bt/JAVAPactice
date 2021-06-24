/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sumit
 */
public class SingeltonCheck {

    private static SingeltonCheck Singelton_Instance = null;
    public String s = "";

    public SingeltonCheck() {
        s = "In Singelton class ";
    }

    public static SingeltonCheck getInstance() {
        if (Singelton_Instance == null) {
            Singelton_Instance = new SingeltonCheck();
        }
        return Singelton_Instance;
    }

}
