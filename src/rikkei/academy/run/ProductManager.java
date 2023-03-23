package rikkei.academy.run;

import rikkei.academy.config.Config;
import rikkei.academy.model.Product;
import rikkei.academy.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {


   public static ArrayList<Product> productArrayList = new ArrayList<>();

    public static void main(String[] args) {
        productArrayList.add(new Product(1,"dưa hấu",100));
        productArrayList.add(new Product(2,"lê",20));
        productArrayList.add(new Product(3,"xoài",10));
        int choose;

        do {
            System.out.println("" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n");
            choose = Config.input().nextInt();
            switch (choose) {
                case 1:
                    Service.addProduct();
                    break;
                case 2:
                    Service.edit();
                    break;
                case 3:
                    Service.deleteById();
                    break;
                case 4:
                    System.out.println(productArrayList);
                    break;
                case 5:
                    Service.searchProduct();
                    break;
                case 6:
                    break;
            }
        } while (choose!=6);
    }
}
