/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author PC04
 */
public class Calculadora {
    
    static double ans = 0;
    
    public static double suma (double a , double b){
        ans = a+b;
        return ans;
    } 
    public static double resta (double a , double b){
        ans = a-b;
        return ans;
    }
    public static double divide (double a , double b){
        ans = a/b;
        return ans;
    }
    public static double multiplica (double a , double b){
        ans = a*b;
        return ans;
    }
    
    public static double suma2 (double a){
        ans += a;
        return ans;
    } 
    public static double resta2 (double a){
        ans -= a;
        return ans;
    }
    public static double divide2 (double a){
        ans /= a;
        return ans;
    }
    public static double multiplica2 (double a){
        ans *= a;
        return ans;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }   
}
