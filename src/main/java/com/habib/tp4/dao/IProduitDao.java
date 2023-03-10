package com.habib.tp4.dao;

import com.habib.tp4.metier.entities.Produit;

import java.util.List;

public interface IProduitDao {
    public Produit save(Produit p);
    public List<Produit> produitsParMC(String mc);
    public Produit getProduit(Long id);
    public Produit updateProduit(Produit p);
    public void deleteProduit(Long id);
}