package com.eep.service;

import com.eep.entity.Usuarios;
import com.eep.service.impl.UsuariosServiceImpl;
import org.springframework.stereotype.Service;

public interface UsuariosService{

    public boolean checkExistencia(String nombreUsuario, String password);
    public boolean permitirAcceso();
    public Usuarios devolucionUsuarioCompleto(String nombreusuario, String password);
    public Usuarios devolucionUsuarioCompletoNoUsernameAndPassword();
    public void cerrarSesion();
}
