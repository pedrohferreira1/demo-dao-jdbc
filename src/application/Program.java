package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.err.println("--- TESTE 01: seller findByID -----");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller );
		
		System.err.println("--- TESTE 02: seller findByDepartment-----");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.err.println("--- TESTE 03: seller findAll -----");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
	}
}
