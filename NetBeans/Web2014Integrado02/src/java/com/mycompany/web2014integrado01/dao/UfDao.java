package com.mycompany.web2014integrado01.dao;

import com.mycompany.web2014integrado01.bd.BancoDeDados;
import com.mycompany.web2014integrado01.modelo.Estado;
import java.util.List;

/**
 *
 * @author bhpachulski
 */
public class UfDao {
    
    public void insert (Estado e) {
        BancoDeDados.estados.add(e);
    }
    
    public void update (Estado e) {
        del(e);
        insert(e);
    }
    
    public void del (Estado e) {
        BancoDeDados.estados.remove(e);
    }
    
    public List<Estado> list () {
        return BancoDeDados.estados;
    }
    
}
