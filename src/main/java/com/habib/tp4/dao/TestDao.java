package com.habib.tp4.dao;

import com.habib.tp4.metier.entities.Produit;

import java.util.List;

public class TestDao {
    public static void main(String[] args) {
        ProduitDaoImpl pdao = new ProduitDaoImpl();
        Produit prod = pdao.save(new Produit("Ojaa cavillar", 2800));
        System.out.println(prod);
        List<Produit> prods = pdao.produitsParMC("glace");
        for (Produit p : prods)
            System.out.println(p);
    }
}
