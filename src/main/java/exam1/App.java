package exam1;

import java.io.*;
import java.util.*;

public class App {
    private static final String fileNameAccess = "C:\\projects\\job4j_elementary\\src\\main\\java\\exam1\\access.txt";
    private static final String fileNameBase = "C:\\projects\\job4j_elementary\\src\\main\\java\\exam1\\dataBase.txt";
    private static final String fileReportStructure = "C:\\projects\\job4j_elementary\\src\\main\\java\\exam1\\reportStructure.txt";
    private static final String fileReportWage = "C:\\projects\\job4j_elementary\\src\\main\\java\\exam1\\reportWage.txt";
    private static final String fileReportTop10Wage = "C:\\projects\\job4j_elementary\\src\\main\\java\\exam1\\reportTop10Wage.txt";
    private static final String fileReportTop10Year = "C:\\projects\\job4j_elementary\\src\\main\\java\\exam1\\reportTop10Year.txt";
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //        access();
        boolean workApp = false;
        do {
            System.out.println("Укажите требуемое действие: 1 - поиск сотрудников, 2 - создание отчетов, " +
                    "3 - изменение базы данных, 0 - выход из программы");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        search();
                        break;
                    case 2:
                        report();
                        break;
                    case 3:
                        changeData();
                        break;
                    case 0:
                        workApp = true;
                        break;
                    default:
                        System.out.println("Введенное число за диапазоном 0 - 3, попробуйте поиск еще раз!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введен неверный символ, попробуйте поиск еще раз!");
                sc.nextLine();
            }
        } while (!workApp);
        System.out.println("Выход из программы");
    }

    static void saveCsv(List<? extends Employee> list, String fileName) {
        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        )
        {
            StringBuilder builder = new StringBuilder();
            for(Employee emp : list) {
                builder.setLength(0);
                builder.append(emp.getName());
                builder.append(",");
                builder.append(emp.getBirthDay());
                builder.append(",");
                builder.append(emp.getGender());
                builder.append(",");
                builder.append(emp.getPhone());
                builder.append(",");
                builder.append(emp.getPosition());
                builder.append(",");
                builder.append(emp.getDivision());
                builder.append(",");
                builder.append(emp.getChief());
                builder.append(",");
                builder.append(emp.getEmploymentDate());
                builder.append(",");
                builder.append(emp.getWage());
                builder.append("\n");
                bufferedWriter.write(builder.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int searchName () {
        System.out.println("Введите ФИО сотрудника: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        List<Employee> employees = searching();
        int del = -1;
        for (int i = 0; i < employees.size(); i++) {
            if(name.equals(employees.get(i).getName())) {
                del = i;
                break;
            }
        }
        if (del == -1) {
            System.out.println("Фамилия введена неверно, попробуйте еще раз.");
        }
        return del;
    }

    static void changeData() {
        boolean changFinish = false;
        do {
            System.out.println("Укажите действие: 1 - принять нового сотрудника, 2 - удалить сотрудника, " +
                    "3 - изменить данные о сотруднике, 0 - выход из работы с базой данных");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Введите ФИО сотрудника: ");
                        String name = sc.nextLine();
                        name = sc.nextLine();
                        System.out.println("Введите день рождения сотрудника дд.мм.гг: ");
                        String birthDay = sc.nextLine();
                        birthDay = sc.nextLine();
                        System.out.println("Введите пол сотрудника (только F / M!))): ");
                        String gender = sc.nextLine();
                        gender = sc.nextLine();
                        System.out.println("Введите телефон сотрудника (ХХХ) ХХХ-ХХХХ): ");
                        String phone = sc.nextLine();
                        phone = sc.nextLine();
                        System.out.println("Введите должность сотрудника: ");
                        String position = sc.nextLine();
                        position = sc.nextLine();
                        System.out.println("Введите отдел сотрудника: ");
                        String division = sc.nextLine();
                        division = sc.nextLine();
                        System.out.println("Введите ФИО начальника сотрудника: ");
                        String chief = sc.nextLine();
                        chief = sc.nextLine();
                        System.out.println("Введите дату приема сотрудника на работу дд.мм.гг: ");
                        String employmentDate = sc.nextLine();
                        employmentDate = sc.nextLine();
                        System.out.println("Введите ЗП сотрудника в $: ");
                        int wage = 0;
                        try {
                            wage = Integer.parseInt(sc.nextLine());
                        } catch (InputMismatchException e) {
                            System.out.println("Введено нецелое число, попробуйте ввести еще раз!");
                            sc.nextLine();
                        }
                        List<Employee> employees = searching();
                        Employee emp = new Employee(name, birthDay, gender, phone, position, division, chief,
                                employmentDate, wage);
                        employees.add(emp);
                        saveCsv(employees, fileNameBase);
                        List<Employee> employees1 = searching();
                        System.out.println("Новый список из базы для проверки\n: ");
                        printData(employees1);
                        System.out.println("Сотрудник добавлен!");
                        break;
                    case 2:
                        int del = searchName();
                        if (del != -1) {
                            List<Employee> employees21 = searching();
                            employees21.remove(del);
                            saveCsv(employees21, fileNameBase);
                            List<Employee> employees22 = searching();
                            System.out.println("Новый список из базы для проверки\n: ");
                            printData(employees22);
                            System.out.println("Сотрудник удален!");
                        }
                        break;
                    case 3:
                        int change = searchName();
                        if (change != -1) {
                            List<Employee> employees31 = searching();
                            boolean changeFinish = false;
                            do {
                                System.out.println("Укажите какие данные хотите поменять: 1 - ФИО, 2 - день рождения, " +
                                        "3 - пол, 4 - телефон,\n 5 - должность, 6 - отдел, 7 - ФИО начальника, " +
                                        " 8 - дату приема на работу,\n 9 - ЗП,  0 - выход из изменения данных");
                                try {
                                    int choice1 = sc.nextInt();
                                    switch (choice1) {
                                        case 1:
                                            System.out.println("Введите новую ФИО: ");
                                            String case1 = sc.nextLine();
                                            case1 = sc.nextLine();
                                            employees31.get(change).setName(case1);
                                            break;
                                        case 2:
                                            System.out.println("Введите новую дату рожденя дд.мм.гг: ");
                                            String case2 = sc.nextLine();
                                            case2 = sc.nextLine();
                                            employees31.get(change).setBirthDay(case2);
                                            break;
                                        case 3:
                                            System.out.println("Введите новый пол: ");
                                            String case3 = sc.nextLine();
                                            case3 = sc.nextLine();
                                            employees31.get(change).setGender(case3);
                                            break;
                                        case 4:
                                            System.out.println("Введите новый телефон (ХХХ) ХХХ-ХХХХ: ");
                                            String case4 = sc.nextLine();
                                            case4 = sc.nextLine();
                                            employees31.get(change).setGender(case4);
                                            break;
                                        case 5:
                                            System.out.println("Введите новую должность: ");
                                            String case5 = sc.nextLine();
                                            case5 = sc.nextLine();
                                            employees31.get(change).setPosition(case5);
                                            break;
                                        case 6:
                                            System.out.println("Введите новую должность: ");
                                            String case6 = sc.nextLine();
                                            case6 = sc.nextLine();
                                            employees31.get(change).setDivision(case6);
                                            break;
                                        case 7:
                                            System.out.println("Введите нового начальника: ");
                                            String case7 = sc.nextLine();
                                            case7 = sc.nextLine();
                                            employees31.get(change).setChief(case7);
                                            break;
                                        case 8:
                                            System.out.println("Введите новую дату приема на работу дд.мм.гг: ");
                                            String case8 = sc.nextLine();
                                            case8 = sc.nextLine();
                                            employees31.get(change).setPosition(case8);
                                            break;
                                        case 9:
                                            System.out.println("Введите новую заработную плату: ");
                                            try {
                                                int case9 = sc.nextInt();
                                                employees31.get(change).setWage(case9);
                                            } catch (InputMismatchException e) {
                                                System.out.println("Введено не целое число!");
                                                sc.nextLine();
                                            }
                                            break;
                                        case 0:
                                            changeFinish = true;
                                            break;
                                        default:
                                            System.out.println("Введенное число за диапазоном 0 - 9, попробуйте поиск еще раз!");
                                            break;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Введен неверный символ, попробуйте поиск еще раз!");
                                    sc.nextLine();
                                }
                            } while (!changeFinish);
                            saveCsv(employees31, fileNameBase);
                            List<Employee> employees32 = searching();
                            System.out.println("Новый список из базы для проверки\n: ");
                            printData(employees32);
                            System.out.println("Данные сотрудника изменены!");
                        }
                        break;
                    case 0:
                        changFinish = true;
                        break;
                    default:
                        System.out.println("Введенное число за диапазоном 0 - 3, попробуйте поиск еще раз!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введен неверный символ, попробуйте поиск еще раз!");
                sc.nextLine();
            }
        } while (!changFinish);
        System.out.println("Выход из из работы с базой данных");
    }

    static List<Employee> searching(){
        List<Employee> employeeList = null;
        try (FileReader reader = new FileReader(fileNameBase);
             BufferedReader bufReader = new BufferedReader(reader);
        )
        {
            employeeList = parseDataBase(bufReader);
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return employeeList;
    }

    static List<Employee> parseDataBase(BufferedReader reader) throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        String str = null;
        while ((str = reader.readLine()) != null) {
            String[] value = str.split(",");
                Employee emp = new Employee();
                emp.setName(value[0]);
                emp.setBirthDay(value[1]);
                emp.setGender(value[2]);
                emp.setPhone(value[3]);
                emp.setPosition(value[4]);
                emp.setDivision(value[5]);
                emp.setChief(value[6]);
                emp.setEmploymentDate(value[7]);
                emp.setWage(Integer.parseInt(value[8]));
                employees.add(emp);
        }
        return employees;
    }

    static List<Report> reportList(List<Employee> emp) {
        List<Report> repList = new ArrayList<>();
        String division1 = emp.get(0).getDivision();
        Report rep = new Report(emp.get(0).getDivision(), 0, 0, "", "");
        repList.add(rep);
        for (int i = 0; i < emp.size(); i++) {
            if(!emp.get(i).getDivision().equals(division1)) {
                Report rep1 = new Report(emp.get(i).getDivision(), 0, 0, "", "");
                repList.add(rep1);
                division1 = emp.get(i).getDivision();
            }
        }
        for (int i = 0; i < repList.size(); i++) {
            int amount = 0;
            int wage = 0;
            String chief = "";
            String employers = "";
            for (int j = 0; j < emp.size(); j++) {
                if(repList.get(i).getDivision().equals(emp.get(j).getDivision())) {
                    amount ++;
                    wage += emp.get(j).getWage();
                    if ("Chief".equals(emp.get(j).getPosition()) || "chief".equals(emp.get(j).getPosition())) {
                        chief = emp.get(j).getName();
                    } else {
                        employers = employers + "| " + emp.get(j).getName();
                    }
                }
            }
            repList.get(i).setAmount(amount);
            repList.get(i).setWage(wage);
            repList.get(i).setChief(chief);
            repList.get(i).setEmployers(employers);
        }
        return repList;
    }

    static void report() {
        boolean reportFinish = false;
        do {
            System.out.println("Укажите параметр отчета: 1 - Структура организациии, 2 - Средняя зарплата по " +
                    "организации и по отделам, 3 - ТОП-10 самых дорогих сотрудников по зарплате, " +
                    "4 - ТОП-10 самых преданных сотрудников по количеству лет работы в организации, " +
                    "0 - выход из режима формирования отчетов");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Структура организациии: ");
                        List<Employee> employees1 = searching();
                        Collections.sort(employees1, new Comparator() {
                            @Override public int compare(Object o1, Object o2) {
                                Employee e1 = (Employee) o1;
                                Employee e2 = (Employee) o2;
                                return e1.getDivision().compareTo(e2.getDivision());
                            }
                        });
                        List<Report> rep = reportList(employees1);
                        for (int i = 0; i < rep.size(); i++) {
                            System.out.printf("В отделе %s начальник %s, список работников: %s\n", rep.get(i).getDivision(),
                                    rep.get(i).getChief(), rep.get(i).getEmployers());
                        }
                        try (
                                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileReportStructure));
                        )
                        {
                            StringBuilder builder = new StringBuilder();
                            for (int i = 0; i < rep.size(); i++) {
                                builder.setLength(0);
                                builder.append("В отделе " + rep.get(i).getDivision() + " начальник" +
                                        rep.get(i).getChief() + ", список работников: " + rep.get(i).getEmployers() + "\n");
                                bufferedWriter.write(builder.toString());
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        List<Employee> employees2 = searching();
                        int summ = 0;
                        for (int i = 0; i < employees2.size(); i++) {
                            summ += employees2.get(i).getWage();
                        }
                        int mediumWage = summ / employees2.size();
                        System.out.println("Средняя зарплата по организации равна: " + mediumWage);
                        Collections.sort(employees2, new Comparator() {
                            @Override public int compare(Object o1, Object o2) {
                                Employee e1 = (Employee) o1;
                                Employee e2 = (Employee) o2;
                                return e1.getDivision().compareTo(e2.getDivision());
                            }
                        });
                        List<Report> rep2 = reportList(employees2);
                        for (int i = 0; i < rep2.size(); i++) {
                            System.out.printf("В отделе %s работают %d человек, сумма зарплат отдела %d, " +
                                            "средняя зарплата равна %d\n", rep2.get(i).getDivision(),
                                    rep2.get(i).getAmount(), rep2.get(i).getWage(),
                                    rep2.get(i).getWage() / rep2.get(i).getAmount());
                        }
                        try (
                                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileReportWage));
                        )
                        {
                            bufferedWriter.write("Средняя зарплата по организации равна: " + mediumWage);
                            StringBuilder builder = new StringBuilder();
                            for (int i = 0; i < rep2.size(); i++) {
                                builder.setLength(0);
                                builder.append("В отделе " + rep2.get(i).getDivision() + " работают " +
                                        rep2.get(i).getAmount() + " человек, средняя зарплата в отделе равна " +
                                        rep2.get(i).getWage() / rep2.get(i).getAmount() + "\n");
                                bufferedWriter.write(builder.toString());
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        System.out.println("ТОП-10 самых дорогих сотрудников по зарплате: ");
                        List<Employee> employees3 = searching();
                        Collections.sort(employees3, new Comparator() {
                            @Override public int compare(Object o1, Object o2) {
                                Employee e1 = (Employee) o1;
                                Employee e2 = (Employee) o2;
                                return e2.getWage() - e1.getWage();
                            }
                        });
                        List<Employee> top10Wage = employees3.subList(0, 10);
                        printData(top10Wage);
                        saveCsv(top10Wage, fileReportTop10Wage);
                        System.out.println("Отчет составлен!");
                        break;
                    case 4:
                        List<Employee> employees4 = searching();
                        int size = employees4.size();
                        employees4.add(employees4.get(0));
                        System.out.println("ТОП-10 самых преданных сотрудников по количеству лет работы в организаци: ");
                        for (int i = 0; i < employees4.size() - 1; i++) {
                            for (int j = employees4.size() - 1; j > i; j--) {
                                String str = employees4.get(j).getEmploymentDate().substring(6);
                                int res = Integer.parseInt(str);
                                String str1 = employees4.get(j - 1).getEmploymentDate().substring(6);
                                int res1 = Integer.parseInt(str1);
                                if(res1 > res) {
                                    employees4.set(size, employees4.get(j - 1));
                                    employees4.set((j - 1), employees4.get(j));
                                    employees4.set((j), employees4.get(size));
                                }
                            }
                        }
                        List<Employee> top10Yerars = employees4.subList(0, 10);
                        printData(top10Yerars);
                        saveCsv(top10Yerars, fileReportTop10Year);
                        System.out.println("Отчет составлен!");
                        break;
                    case 0:
                        reportFinish = true;
                        break;
                    default:
                        System.out.println("Введенное число за диапазоном 0 - 4, попробуйте поиск еще раз!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введен неверный символ, попробуйте поиск еще раз!");
                sc.nextLine();
            }
        } while (!reportFinish);
        System.out.println("Выход из отчетов");
    }

    public static void printData(List<? extends Employee> list) {
        printDefis(21 * (Employee.getTitles().length + 1) - Employee.getTitles().length/2);
        for (int i = 0; i < Employee.getTitles().length; i++) {
            System.out.printf(" %20s |", Employee.getTitles()[i]);
        }
        System.out.println();
        printDefis(21 * (Employee.getTitles().length + 1) - Employee.getTitles().length/2);
        for (Employee emp : list) {
            System.out.printf(" %20s |", emp.getName());
            System.out.printf(" %20s |", emp.getBirthDay());
            System.out.printf(" %20s |", emp.getGender());
            System.out.printf(" %20s |", emp.getPhone());
            System.out.printf(" %20s |", emp.getPosition());
            System.out.printf(" %20s |", emp.getDivision());
            System.out.printf(" %20s |", emp.getChief());
            System.out.printf(" %20s |", emp.getEmploymentDate());
            System.out.printf(" %20s |", emp.getWage());
            System.out.println();
            printDefis(21 * (Employee.getTitles().length + 1) - Employee.getTitles().length/2);
        }
    }

    static void printDefis (int size){
        for (int i = 0; i < size + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static List<Employee> parseDataBase(BufferedReader reader, int position, String content) throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        String str = null;
        while ((str = reader.readLine()) != null) {
            String[] value = str.split(",");
            if(value[position].equals(content)) {
                Employee emp = new Employee();
                emp.setName(value[0]);
                emp.setBirthDay(value[1]);
                emp.setGender(value[2]);
                emp.setPhone(value[3]);
                emp.setPosition(value[4]);
                emp.setDivision(value[5]);
                emp.setChief(value[6]);
                emp.setEmploymentDate(value[7]);
                emp.setWage(Integer.parseInt(value[8]));
                employees.add(emp);
            }
        }
        return employees;
    }

    static void searching(String str, int pozition){
        List<Employee> employeeList1 = null;
        try (FileReader reader = new FileReader(fileNameBase);
             BufferedReader bufReader = new BufferedReader(reader);
        )
        {
            employeeList1 = parseDataBase(bufReader, pozition, str);
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
        printData(employeeList1);
    }

    public static void search() {
        boolean searchFinish = false;
        do {
            System.out.println("Укажите параметр поиска: 1 - ФИО сотрудника, 2 - должность, 3 - название отдела, " +
                    "4 - ФИО Начальника, 0 - выход из поиска");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Введите ФИО сотрудника: ");
                        String name = sc.nextLine();
                        name = sc.nextLine();
                        searching(name, 0);
                        System.out.println("Поиск окончен!");
                        break;
                    case 2:
                        System.out.println("Введите должность сотрудника");
                        String position = sc.nextLine();
                        position = sc.nextLine();
                        searching(position, 4);
                        System.out.println("Поиск окончен!");
                        break;
                    case 3:
                        System.out.println("Введите название отдела");
                        String division = sc.nextLine();
                        division = sc.nextLine();
                        searching(division, 5);
                        System.out.println("Поиск окончен!");
                        break;
                    case 4:
                        System.out.println("Введите ФИО Начальника");
                        String chief = sc.nextLine();
                        chief = sc.nextLine();
                        searching(chief, 6);
                        System.out.println("Поиск окончен!");
                        break;
                    case 0:
                        searchFinish = true;
                        break;
                    default:
                        System.out.println("Введенное число за диапазоном 0 - 4, попробуйте поиск еще раз!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введен неверный символ, попробуйте поиск еще раз!");
                sc.nextLine();
            }
        } while (!searchFinish);
        System.out.println("Выход из поиска");
    }

    public static void access() {
        boolean hasAccess = false;
        do {
            try(
                BufferedReader reader = new BufferedReader(new FileReader(fileNameAccess))) {
                String login = reader.readLine();
                String password = reader.readLine();
                System.out.println("Введите логин: ");
                String curLogin = sc.nextLine();
                System.out.println("Введите пароль: ");
                String curPassword = sc.nextLine();
                if(curLogin.equals(login) && curPassword.equals(password)) {
                    hasAccess = true;
                }
                if (hasAccess) {
                    System.out.println("Доступ разрешен");
                } else {
                    System.out.println("Доступ запрещен");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка! Файл не найден");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } while (!hasAccess);
    }
}
