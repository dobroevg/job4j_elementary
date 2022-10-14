package uroki.lesson34;

import java.io.*;
import java.util.*;



public class App4 {

	private  static final Scanner sc = new Scanner(System.in);

	static void printData(List<? extends Employee> list) {
		for (int i = 0; i < Employee.getTitles().length; i++) {
			System.out.printf(" %35s |", Employee.getTitles()[i]);
		}
		System.out.println();
		for (Employee emp : list) {    //  for (var map : list)
			System.out.printf(" %35s |", emp.getName());
			System.out.printf(" %35s |", emp.getPhone());
			System.out.printf(" %35s |", emp.getEmail());
			System.out.printf(" %35s |", emp.getNumberrange());
			System.out.printf(" %35s |", emp.getCurrency());
			System.out.println();
		}

	}

	// убрал лишние ? из типа у mapList
	static class CsvResult{
		public CsvResult(String[] titles, List<Map<String, String>> mapList) {
			this.titles = titles;
			this.mapList = mapList;
		}

		public String[] getTitles() {
			return titles;
		}
		public List<Map<String, String>> getMapList() {
			return mapList;
		}

		private String[] titles;
		private List <Map <String, String>> mapList;
	}

	static List<Employee> parseCsv(BufferedReader reader) throws IOException {
		// чтобы везде не исполоьзовать wildcard (вопросики в типах) достаточно было указать,
		// что ArrayList хранит хэш-таблицы по интерфейсу
//		ArrayList<HashMap<String, String>> employees = new ArrayList<>();


		ArrayList<Employee> employees = new ArrayList<>();
		String str = null;
		String str1 = "name,phone,email,numberrange,currency";

		if (!str1.equals(reader.readLine())) {
			throw new IOException("неверный формат заголовков");
		}

		while ((str = reader.readLine()) != null) {
			String[] value = str.split(",");
			Employee emp = new Employee();
			emp.setName(value[0]);
			emp.setPhone(value[1]);
			emp.setEmail(value[2]);
			emp.setNumberrange(Integer.parseInt(value[3]));
			emp.setCurrency(Double.parseDouble(value[4].substring(1)));
			employees.add(emp);
		}
		return employees;

	}




	public static void main(String[] args)  {
		String fileName = "C:\\projects\\job4j_elementary\\src\\main\\java\\uroki\\lesson34\\Resources\\data.txt";

		List<Employee> employeeList = null;
		try (FileReader reader = new FileReader(fileName);
			 BufferedReader bufReader = new BufferedReader(reader);
			 )
		{
			employeeList = parseCsv(bufReader);
		}
		catch (IOException e) {
			e.printStackTrace();
			return;
		}
		printData(employeeList);

	}

	public static Map<String, String> createMap (String[] titles) {
		HashMap<String, String> emp = new HashMap<>();
		for (int i = 0; i < titles.length; i++) {
			System.out.println(titles[i] + ": ");
			emp.put(titles[i], sc.nextLine());
		}
		return emp;
	}

	public static void saveCsv(Writer writer, String[] titles, List<? extends Map <String, String>> list) throws IOException {
		String str = String.join(",", titles);
		writer.write(str + "\n");
		StringBuilder builder = new StringBuilder();
		for (Map<String, String> map : list) {
			builder.setLength(0);
			for (String key : titles) {
				builder.append(map.get(key));
				builder.append(",");
			}
			builder.deleteCharAt(builder.length() - 1);
			builder.append("\n");
			writer.write(builder.toString());
		}
	}

}
