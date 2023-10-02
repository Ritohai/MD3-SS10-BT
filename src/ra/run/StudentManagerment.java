package ra.run;

import ra.service.Student;

import java.util.*;

public class StudentManagerment {
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("********** StudentManagerment************ \n" +
                    "1. Thêm mới học sinh\n" +
                    "2. Sửa học sinh\n" +
                    "3.Xóa học sinh\n" +
                    "4.Tìm kiếm học sinh theo studentId\n" +
                    "5.Sắp xếp theo tên học sinh từ a-z\n" +
                    "6.In ra danh sách học sinh\n" +
                    "7.Sắp xếp điểm tăng dần\n" +
                    "8. Sắp xếp điểm giảm dần\n" +
                    "9.Thoát\n");
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    sortStudent();
                    break;
                case 6:
                    showStudent();
                    break;
                case 7:
                    sortUpMark();
                    break;
                case 8:
                    sortDownMark();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại từ 1 - 9!!!");
                    break;
            }
        }
    }

    public static void addStudent() {
        System.out.println("Nhập số  lượng sinh viên muốn thêm: ");
        int number = Integer.parseInt(new Scanner(System.in).nextLine());
        for (int i = 0; i < number; i++) {
            Student student = new Student();
            System.out.println("Học sinh thứ " + (i + 1) + " :");
            student.input();
            students.add(student);
        }
        System.out.println("Thêm mới thành công.");
    }

    public static void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn sửa: ");
        int id = new Scanner(System.in).nextInt();
        boolean check = false;
        for (Student value : students) {
            if (value.getStudentId() == id) {
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                System.out.println("Nhập số điện thoại: ");
                String phone = scanner.nextLine();
                System.out.println("Nhập giới tính: ");
                boolean sex = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Nhập điểm: ");
                double mark = Double.parseDouble(scanner.nextLine());

//                Lấy ra id rồi set lại các trường
                value.setStudentName(name);
                value.setAddress(address);
                value.setSdt(phone);
                value.setSex(sex);
                value.setMark(mark);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không thấy id muốn sửa.");
        } else {
            System.out.println("Sửa thành công.");
        }
    }

    public static void deleteStudent() {
        System.out.println("Nhập id muốn xóa: ");
        int id = new Scanner(System.in).nextInt();
        boolean check = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == id) {
                students.remove(i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không thấy id muốn xóa.");
        } else {
            System.out.println("Xóa thành công.");
        }

    }

    public static void searchStudent() {
        System.out.println("Nhập id cần tìm kiếm: ");
        int id = new Scanner(System.in).nextInt();
        boolean check = false;
        for (Student st:students) {
            if(st.getStudentId() == id) {
                System.out.println(st.display());
                check = true;
                break;
            }
        }
        if(!check) {
            System.out.println("Không thấy id. ");
        }
    }

    public static void sortStudent() {
       Collections.sort(students, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.getStudentName().compareTo(o2.getStudentName());
           }
       });
        for (Student st:students) {
            System.out.println(st.display());
        }
    }

    public static void showStudent() {
        System.out.println("Thông tin sinh viên: ");
        for (Student st : students) {
            System.out.println(st.display());
        }
    }

    public static void sortUpMark() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getMark(),o2.getMark());
            }
        });
        for (Student st:students) {
            System.out.println(st.display());
        }
    }

    public static void sortDownMark() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getMark(),o1.getMark());
            }
        });
        for (Student st:students) {
            System.out.println(st.display());
        }
    }

}
