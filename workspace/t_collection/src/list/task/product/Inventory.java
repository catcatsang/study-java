package list.task.product;

import java.util.List;

import list.task.DBConnecter;

public class Inventory {
//	   상품 서비스
//	   - 상품 추가
	
	public void addProduct(Product item) {
		DBConnecter.products.add(item);

	}

//	   - 상품 조회
	
	public Product searchProduct(String item) {
		for (Product product : DBConnecter.products) {
			if (product.getName().equals(item)) {
				return product;
			}
			
		}
		return null;
	}

//		- 상품을 조회 후 수정
	public Product replace(String item) {
//		매개변수 item 을 가져옴
		Product product = searchProduct(item);
//		프로덕트 타입의 물건을 찾는 메소드를 실행 
		product.setName(item);
//		물건을 재정의함.
		return product;
	}
//		- 상품을 조회 후 삭제
	public void remove(Product product) {
		DBConnecter.products.remove(product);
	}
//	   - 상품 목록
	public List<Product> productList() {
		return DBConnecter.products;
	}
	   
	   

}
