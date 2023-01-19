package controller;

import java.util.Scanner;

import model.util.AttendanceService;
import view.AttendanceView;

public class Presenter {
    private AttendanceView view;
    private AttendanceService service;

    public Presenter(AttendanceView view, AttendanceService service) {
        this.view = view;
        this.service = service;
    }
    
    public void presentation (){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Выберите действие");
            System.out.println("1 - Показать процент посещяемости студентов");
            System.out.println("2 - Сортировать студентов по посещаемости");
            System.out.println("3 - Вывести список леньтяев");
            // if (Integer.parseInt(scanner.nextLine()) == 1){
            //     view.printAttendance(this.service);
            // }
            // else if (Integer.parseInt(scanner.nextLine()) == 2){
            //     view.printSortedAttendance(this.service);
            // }
            // else if (Integer.parseInt(scanner.nextLine()) == 3){
            //     view.printSortedAttendanceTruants(this.service);
            // }
            // else {
            //     System.out.println("Неверная комманда - попробуйте еще раз");
            // }
            int switcher = Integer.parseInt(scanner.nextLine());
            switch(switcher){
                case 1: 
                    view.printAttendance(this.service);
                    break;
                case 2:
                    view.printSortedAttendance(this.service);
                    break;
                case 3:
                view.printSortedAttendanceTruants(this.service);
                break;
            }
        }
    }
}
