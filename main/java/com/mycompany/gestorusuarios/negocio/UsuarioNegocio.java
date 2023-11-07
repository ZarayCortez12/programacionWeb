/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorusuarios.negocio;

import com.mycompany.gestorusuarios.accesoDatos.entidades.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author docente
 */
public class UsuarioNegocio implements Serializable {
    
    private List<Usuario> usuarios;

    public UsuarioNegocio() {
        usuarios = new ArrayList<Usuario>();
    }

    
    
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public boolean agregarUsuario(Usuario usuario){
        boolean rta=false;
        // logica
        usuarios.add(usuario);
        rta=true;
        return rta;
    }
    
}
