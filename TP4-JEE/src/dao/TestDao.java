package dao;
import java.util.List;
import metier.entities.Produit;

public class TestDao {
public static void main(String[] args) {
	
		ProduitDaoImpl pdao= new ProduitDaoImpl();
		Produit prod= pdao.save(new Produit("Iphone 8 Plus",2800));
		System.out.println(prod);
		List<Produit> prods =pdao.produitsParMC("MSI");
		for (Produit p : prods)
		System.out.println(p);
	}
}