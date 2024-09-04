import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo Scanner để đọc nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Hiển thị menu chính
            System.out.println("1. Quản lý Đơn hàng");
            System.out.println("2. Quản lý Khách hàng");
            System.out.println("3. Quản lý Nhân viên");
            System.out.println("4. Quản lý Sản phẩm");
            System.out.println("5. Quản lý Kho");
            System.out.println("6. Thoát");

            // Đọc lựa chọn từ người dùng
            int choice = scanner.nextInt();

            // Xử lý lựa chọn của người dùng
            switch (choice) {
                case 1:
                    DonHang(scanner);
                    break;
                case 2:
                    KhachHang(scanner);
                    break;
                case 3:
                    NhanVien(scanner);
                    break;
                case 4:
                    SanPham(scanner);
                    break;
                case 5:
                    Kho(scanner);
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return; // Thoát khỏi vòng lặp và kết thúc chương trình
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
    }

    private static void DonHang(Scanner scanner) {
        while (true) {
            System.out.println("Chọn mục quản lý Đơn hàng:");
            System.out.println("1. Xem đơn hàng");
            System.out.println("2. Thêm đơn hàng");
            System.out.println("3. Sửa đơn hàng");
            System.out.println("4. Xóa đơn hàng");
            System.out.println("5. Quay lại menu chính");

            int subChoice = scanner.nextInt();

            switch (subChoice) {
                case 1:
                    System.out.println("Bạn đã chọn Xem đơn hàng.");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Thêm đơn hàng.");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Sửa đơn hàng.");
                    break;
                case 4:
                    System.out.println("Bạn đã chọn Xóa đơn hàng.");
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    return; // Thoát khỏi menu con và trở về menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
    }

    private static void KhachHang(Scanner scanner) {
        while (true) {
            System.out.println("Chọn mục quản lý Khách hàng:");
            System.out.println("1. Xem khách hàng");
            System.out.println("2. Thêm khách hàng");
            System.out.println("3. Sửa khách hàng");
            System.out.println("4. Xóa khách hàng");
            System.out.println("5. Quay lại menu chính");

            int subChoice = scanner.nextInt();

            switch (subChoice) {
                case 1:
                    System.out.println("Bạn đã chọn Xem khách hàng.");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Thêm khách hàng.");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Sửa khách hàng.");
                    break;
                case 4:
                    System.out.println("Bạn đã chọn Xóa khách hàng.");
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    return; // Thoát khỏi menu con và trở về menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
    }

    private static void NhanVien(Scanner scanner) {
        while (true) {
            System.out.println("Chọn mục quản lý Nhân viên:");
            System.out.println("1. Xem nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Sửa nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Quay lại menu chính");

            int subChoice = scanner.nextInt();

            switch (subChoice) {
                case 1:
                    System.out.println("Bạn đã chọn Xem nhân viên.");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Thêm nhân viên.");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Sửa nhân viên.");
                    break;
                case 4:
                    System.out.println("Bạn đã chọn Xóa nhân viên.");
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    return; // Thoát khỏi menu con và trở về menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
    }

    private static void SanPham(Scanner scanner) {
        while (true) {
            System.out.println("Chọn mục quản lý Sản phẩm:");
            System.out.println("1. Xem sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Quay lại menu chính");

            int subChoice = scanner.nextInt();

            switch (subChoice) {
                case 1:
                    System.out.println("Bạn đã chọn Xem sản phẩm.");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Thêm sản phẩm.");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Sửa sản phẩm.");
                    break;
                case 4:
                    System.out.println("Bạn đã chọn Xóa sản phẩm.");
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    return; // Thoát khỏi menu con và trở về menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
    }

    private static void Kho(Scanner scanner) {
        while (true) {
            System.out.println("Chọn mục quản lý Kho:");
            System.out.println("1. Xem kho");
            System.out.println("2. Thêm kho");
            System.out.println("3. Sửa kho");
            System.out.println("4. Xóa kho");
            System.out.println("5. Quay lại menu chính");

            int subChoice = scanner.nextInt();

            switch (subChoice) {
                case 1:
                    System.out.println("Bạn đã chọn Xem kho.");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Thêm kho.");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Sửa kho.");
                    break;
                case 4:
                    System.out.println("Bạn đã chọn Xóa kho.");
                    break;
                case 5:
                    System.out.println("Quay lại menu chính.");
                    return; // Thoát khỏi menu con và trở về menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        }
    }
}
