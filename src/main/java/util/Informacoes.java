package util;

import modelo.entidades.Administrador;

public class Informacoes {
    private static Administrador usuarioLogado;
    
    public static void limparUsuarioLogado(){
        usuarioLogado = null;
    }
    
    public static boolean temUsuarioLogado(){
        return usuarioLogado != null;
    }

    public static Administrador getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Administrador usuarioLogado) {
        Informacoes.usuarioLogado = usuarioLogado;
    }
}
