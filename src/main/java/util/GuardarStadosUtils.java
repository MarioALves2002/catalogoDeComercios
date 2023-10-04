
package util;


public class GuardarStadosUtils {
    
    static boolean estado = false;
    
    public static void mudarStadado(boolean estado){
        GuardarStadosUtils.estado = estado;
        
        
    }
    
    public static boolean mostrarEstado(){
        return estado;
    }
}
