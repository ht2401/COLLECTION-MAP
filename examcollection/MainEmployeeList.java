package examcollection;

import java.time.LocalDate;
import java.util.*;

public class MainEmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>() {
            {
                add(new Employee("thang", "0394109867", "nghe an", LocalDate.parse("2001-12-24"), "HCNS", "le tan", 1, 354));
                add(new Employee("thong", "0394109867", "thai binh", LocalDate.parse("2002-12-01"), "CSKH", "PM", 10, 254));
                add(new Employee("minh", "0394109867", "ha tinh", LocalDate.parse("2004-12-07"), "SALE", "saler", 6, 314));
                add(new Employee("hieu", "0394109867", "thanh hoa", LocalDate.parse("2001-02-01"), "BOD", "le tan", 3, 454));
                add(new Employee("oanh", "0394109867", "ha noi", LocalDate.parse("2001-09-03"), "HCNS", "Tech lead", 2, 854));
                add(new Employee("cong", "0394109867", "ha nam", LocalDate.parse("2001-09-29"), "BOD", "le tan", 7, 384));
                add(new Employee("tu", "0394109867", "bac ninh", LocalDate.parse("2004-04-08"), "PRODUCT", "PM", 5, 954));
                add(new Employee("thuong", "0394109867", "quang binh", LocalDate.parse("2003-10-05"), "PRODUCT", "CTO", 10, 354));
                add(new Employee("thanh", "0394109867", "quang tri", LocalDate.parse("2001-12-01"), "SALE", "CEO", 8, 357));
            }
        };

        Map<String, List<Employee>> company = new HashMap<>();
        employees.forEach(employee -> {
            List<Employee> departmentClass = company.get(employee.getDepartment());
            if (departmentClass == null) {
                departmentClass = new ArrayList<Employee>() {
                    {
                        add(employee);
                    }
                };
            } else {
                departmentClass.add(employee);
            }
            company.put(employee.getDepartment(), departmentClass);
        });

        System.out.println("------------------------------------------------------");
        System.out.println("danh sach nhan vien phong hanh chinh nhan su :");
        System.out.println(company.get("HCNS"));
        System.out.println("danh sach nhan vien cham soc khach hang :");
        System.out.println(company.get("CSKH"));
        System.out.println("danh sach nhan vien phong sale :");
        System.out.println(company.get("SALE"));
        System.out.println("danh sach nhan vien phong ban dieu hanh :");
        System.out.println(company.get("BOD"));
        System.out.println("danh sach nhan vien phong san xuat :");
        System.out.println(company.get("PRODUCT"));

        for (Employee employee : employees) {
            Collections.sort(company.get(employee.getDepartment()), new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
                }
            });
        }

        System.out.println("------------------------------------------------------");
        System.out.println("sau khi sắp xếp : ");
        System.out.println(company.get("HCNS"));
        System.out.println(company.get("CSKH"));
        System.out.println(company.get("SALE"));
        System.out.println(company.get("BOD"));
        System.out.println(company.get("PRODUCT"));


        System.out.println("------------------------------------------------------");
        System.out.println("lương sau khi tăng là : ");
        for (Employee employee : employees) {
            List<Employee> employees1 = company.get(employee.getDepartment());
            employee.setBasicSalary(employee.getBasicSalary() + employee.getBasicSalary() * 0.1 / employees1.size());
            System.out.println("tên : " + employee.getName() + ", dia chi : " + employee.getAddress() + ", so dien thoai : " + employee.getPhone() + ", ngay sinh : " + employee.getDateOfBirth() + ", phong ban : " + employee.getDepartment() + ", vi tri : " + employee.getLocation() + ", tham nien : " + employee.getSeniority() + ", muc luong : " + employee.getBasicSalary());
        }

        System.out.println("------------------------------------------------------");
        int dayOff;
        for (Employee employee : employees) {
            if (2 > employee.getSeniority()) {
                dayOff = 0;
            } else if (2 < employee.getSeniority() && 3 > employee.getSeniority()) {
                dayOff = 13;
            } else if (3 < employee.getSeniority() && 5 > employee.getSeniority()) {
                dayOff = 15;
            } else if (5 < employee.getSeniority() && 10 > employee.getSeniority()) {
                dayOff = 18;
            } else {
                dayOff = 23;
            }

            System.out.println("tên : " + employee.getName() + ", dia chi : " + employee.getAddress() + ", so dien thoai : " + employee.getPhone() + ", ngay sinh : " + employee.getDateOfBirth() + ", phong ban : " + employee.getDepartment() + ", vi tri : " + employee.getLocation() + ", tham nien : " + employee.getSeniority() + ", muc luong : " + employee.getBasicSalary() + ", ngay nghi : " + dayOff);
        }
    }
}
