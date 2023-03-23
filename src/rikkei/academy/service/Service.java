package rikkei.academy.service;

import rikkei.academy.config.Config;
import rikkei.academy.model.Product;
import rikkei.academy.run.ProductManager;

import java.util.ArrayList;
import java.util.Arrays;

public class Service {
    public static Product create(){
        System.out.println("Nhap id");
        int id = Config.input().nextInt();
        System.out.println("Nhap ten san pham");
        String name = Config.input().nextLine();
        System.out.println("Nhap gia san pham");
        int price = Config.input().nextInt();
        return new Product(id,name,price);
    }

    public static void addProduct(){
        ProductManager.productArrayList.add(create());
    }

    public static void edit(){
        System.out.println("Nhap id san pham muon sua");
        int id = Config.input().nextInt();
        int index = findById(id);
        if (index != -1){
            ProductManager.productArrayList.set(index, create());
        }
    }
    public static int findById(int id){
        for (int i = 0; i < ProductManager.productArrayList.size(); i++) {
            if (id == ProductManager.productArrayList.get(i).getId()){
                return i;
            }
        }
        System.err.println("khong tim thay san pham");
        return -1;
    }

    public static void deleteById(){
        System.out.println("Nhap id san pham muon xoa");
        int id = Config.input().nextInt();
        int index = findById(id);
        if (index!= -1){
            ProductManager.productArrayList.remove(index);
        }
    }

    public static void searchProduct(){
        System.out.println("Nhap tên sản phẩm muốm tìm kiếm");
        String name = Arrays.toString(Config.input().nextLine().split(" "));
        for (int i = 0; i < ProductManager.productArrayList.size(); i++) {
            if (ProductManager.productArrayList.get(i).getProductName().contains(name)){
                ProductManager.productArrayList.get(i);
            }
        }
    }

    public static void sortUpAscending(ArrayList<Product> productArrayList){

    }
}
