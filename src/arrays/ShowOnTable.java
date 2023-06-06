/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arch
 */
public class ShowOnTable {
	
	public static void showOnTable(int[][] array, JTable jTable) {
		DefaultTableModel tm; 
		tm = (DefaultTableModel) jTable.getModel();
		tm.setColumnCount(array[0].length);
		
		// Очистка модели
		for (int i = tm.getRowCount() - 1; i >= 0; i--) {
			tm.removeRow(i);
		}

		jTable.setModel(tm);

		// Заполнение модели
		for (int[] a : array) {
			Vector<Integer> v = new Vector<Integer>(); // В данном случае можно считать это простым массивом
			// Преобразование массива в вектор
			for (int i = 0; i < a.length; i++) {
				v.addElement(a[i]);
			}
			tm.addRow(v);
		}
	}

	public static void showOnTable(double[][] array, JTable jTable) {
		DefaultTableModel tm; 
		tm = (DefaultTableModel) jTable.getModel();
		tm.setColumnCount(array[0].length);
		
		// Очистка модели
		for (int i = tm.getRowCount() - 1; i >= 0; i--) {
			tm.removeRow(i);
		}

		jTable.setModel(tm);

		// Заполнение модели
		for (double[] a : array) {
			Vector<Double> v = new Vector<Double>(); // В данном случае можно считать это простым массивом
			// Преобразование массива в вектор
			for (int i = 0; i < a.length; i++) {
				v.addElement(a[i]);
			}
			tm.addRow(v);
		}
	}

	public static void showOnTable(String[][] array, JTable jTable) {
		DefaultTableModel tm; 
		tm = (DefaultTableModel) jTable.getModel();
		tm.setColumnCount(array[0].length);
		
		// Очистка модели
		for (int i = tm.getRowCount() - 1; i >= 0; i--) {
			tm.removeRow(i);
		}

		jTable.setModel(tm);

		// Заполнение модели
		for (String[] a : array) {
			Vector<String> v = new Vector<String>(); // В данном случае можно считать это простым массивом
			// Преобразование массива в вектор
			for (int i = 0; i < a.length; i++) {
				v.addElement(a[i]);
			}
			tm.addRow(v);
		}
	}
}
