package testFinal.view;

import testFinal.controller.StudentController;
import testFinal.controller.TeacherController;
import testFinal.model.Teacher;
import testFinal.until.Regex;

import java.util.List;
import java.util.Scanner;

public class viewer {
    private static Scanner scanner = new Scanner(System.in);
    private StudentController studentController = new StudentController();
    private TeacherController teacherController = new TeacherController();
    public void runProgramming() {
        int choose;
        do {
            try {
                do {
                    MainMenu();
                    System.out.println("chọn menu muốn xem ");
                    choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            menuTeacher();
                            break;
                        case 2:
                            menuStudent();
                            break;
                        default:
                            System.out.println("Vui Lòng Chọn Chức Năng");
                            break;
                    }
                } while (true);
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng chọn đúng chức năng như ở menu");
            }
        } while (true);
    }

    public void MainMenu(){
        System.out.println("===Menu===");
        System.out.println("1.Menu của giáo viên ");
        System.out.println("2.Menu của học sinh ");
        System.out.println("3.thoát ");
    }
    ///////////// của học sinh //////////////
    private void menuStudent() {


    }


    /////////// của giáo viên /////////////////////////////
    public void menuTeacher() {
        int choose;
        do {
            try {
                System.out.println("==Menu Teacher==");
                System.out.println("1. hiển thị danh sách giáo viên ");
                System.out.println("2. thêm giáo viên ");
                System.out.println("3. sửa giáo viên ");
                System.out.println("4. xóa giáo viên");
                System.out.println("5.tìm kiếm giáo viên ");
                System.out.println("6. Return Main Manu");
                System.out.println("Enter 1 -> 6");
                choose = Integer.parseInt(scanner.nextLine());
                String findId = null;
                String deleteId = null;
                switch (choose) {
                    case 1:
                        List<Teacher> teacher = teacherController.display();
                        displayTeacherList(teacher);
                        break;
                    case 2:
                        Teacher teacher1 = inputDataTeacher();
                        teacherController.add(teacher1);
                        System.out.println(" thêm mới thành công");
                        break;
                    case 3:
                        teacherController.edit(editteacher(inputIdEdit()));
                        break;
                    case 4:
                        String id = inputIdToDeletet();
                        teacherController.delete(id);
                        break;
                    case 5:
                        System.out.println("nhập tên cần tìm kiếm ");
                        String seacherName = scanner.nextLine();
                        List<Teacher> seacherList = teacherController.searchByName(seacherName);
                        displayTeacherList(seacherList);
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Enter 1->6");
                }
            } catch (NumberFormatException e) {
                System.err.println("Hãy chọn một số ");
            }
        } while (true);
    }
    ///// xóa /////
    public String  inputIdToDeletet(){
        String id = null;
        do {
            System.out.println("nhập ID của giáo viên cần xóa ");
            id = scanner.nextLine();
            if (!Regex.checkRegexIdPerson(id)) {
                System.err.println("vui lòng nhập đúng định dạng của ID (1234)");
            }
        } while (!Regex.checkRegexIdPerson(id) || checkId(id));
        return id;
    }
///// hiển thị ////
    public void displayTeacherList(List<Teacher> teacher) {
        for (int i = 0; i <teacher.size() ; i++) {
            System.out.println(teacher.get(i));
        }
    }
    //////thêm /////
    public  Teacher inputDataTeacher() {
        int choosenAdd = 0;
        String id = null;
        String name = null;
        String birthday= null;
        String monday = null;
        Teacher teacher = null;
        do {
            System.out.println("thêm mới thông tin giáo viên ");
            System.out.println("1.id");
            System.out.println("2.tên ");
            System.out.println("3.ngày sinh");
            System.out.println("4.môn dạy");
            choosenAdd = Integer.parseInt(scanner.nextLine());
            switch (choosenAdd) {
                case 1:
                   id = inputId();
                    break;
                case 2:
                    name = inputName();
                    break;
                case 3:
                    birthday = inputBirthday();
                    break;
                case 4:
                    monday = inputMonday();
                    break;
                default:
                    System.out.println(" đã hoàn tất việc thêm mới  ");
                    break;
            }
        } while (choosenAdd > 0 && choosenAdd < 4);
        return new Teacher(id,name,birthday,monday);
    }
    ///// edit /////
    public Teacher editteacher(String id) {
        int choosenEdit = 0;
        String name = null;
        String birthday = null;
        String monday = null;
        Teacher teacher = null;
        do {
            System.out.println("sửa lại thông tin giáo viên ");
            System.out.println("1.tên ");
            System.out.println("2.ngày sinh");
            System.out.println("3.môn dạy");
            System.out.println("Next");
            choosenEdit = Integer.parseInt(scanner.nextLine());
            switch (choosenEdit) {
                case 1:
                    name = inputName();
                    break;
                case 2:
                    birthday = inputBirthday();
                    break;
                case 3:
                    monday = inputMonday();
                    break;
                default:
                    System.out.println(" đã hoàn tất việc sửa đổi ");
                    break;
            }
        } while (choosenEdit > 0 && choosenEdit < 3);
        return new Teacher(id, name, birthday, monday);
    }
    //////////////////////////////////////////////////////////
    public boolean checkId(String id) {
        List<Teacher> teacherList = teacherController.display();
        for (Teacher teacher : teacherList) {
            if (String.valueOf(teacher.getId()).equals(String.valueOf(teacher.getId()))) {
                return false;
            }
            System.out.println("Id đã tồn tại");
        }
        return true;
    }

    public String inputIdEdit() {
        String id = null;
        do {
            System.out.println("nhập ID của giáo viên cần sửa đổi ");
            id = scanner.nextLine();
            if (!Regex.checkRegexIdPerson(id)) {
                System.err.println("vui lòng nhập đúng định dạng của ID (1234)");
            }
        } while (!Regex.checkRegexIdPerson(id) || checkId(id));
        return id;
    }

    public String inputId() {
        String id = null;
        do {
            System.out.println(" nhập ID của giáo viên theo định dạng( 1234  ) ");
            id = scanner.nextLine();
            if (!Regex.checkRegexIdPerson(id)) {
                System.err.println("làm ơn nhập đúng định dạng của ID ( 1234 )");
            }
        } while (!Regex.checkRegexIdPerson(id) || checkId(id));
        return id;
    }
    public String inputName() {
        String name = null;
        do {
            System.out.println("nhập tên của giáo viên  (Thái Sơn )");
            name = scanner.nextLine();
            if (!Regex.checkRegexName(name)) {
                System.err.println("làm ơn nhập đúng định dạng tên ");
            }
        } while (!Regex.checkRegexName(name));
        return name;
    }
    public  String inputMonday() {
        String monday = null;
        System.out.println(" nhập môn dạy ");
        monday = scanner.nextLine();
        return monday;
    }

    public  String inputBirthday() {
        String brithday = null;
        System.out.println(" nhập ngày sinh ");
        brithday = scanner.nextLine();
        return brithday;
    }
    public String inputClassName(){
        String classname = null;
        do {
            System.out.println(" nhập tên lớp học của bạn () ");
            classname = scanner.nextLine();
            if(!Regex.checkRegexIdClass(classname)){
                System.out.println(" nhập lại cho đúng định dạng tên ");
            }
        }while(!Regex.checkRegexIdClass(classname));
        return classname;
    }
}
