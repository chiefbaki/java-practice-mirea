import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<StudentWithGPA> {

    @Override
    public int compare(StudentWithGPA o1, StudentWithGPA o2) {
        if (o1.getGpa() < o2.getGpa()) return -1;
        if (o1.getGpa() > o2.getGpa()) return 1;
        return 0;
    }

    public void quickSort(StudentWithGPA[] students, int low, int high){
        int i = low, j = high;
        // Получаем опорный элемент из середины списка
        double pivot = students[low + (high - low) / 2].getGpa();

        // Делим на 2 списка
        StudentWithGPA exchange;
        while (i <= j) {

            // Если текущее значение из левого списка меньше, чем точка поворота
            // элемент, затем получаем следующий элемент из левого списка
            while (students[i].getGpa() < pivot) {
                i++;
            }
            // Если текущее значение из правого списка больше, чем точка поворота
            // элемент, затем получаем следующий элемент из правого списка
            while (students[j].getGpa() > pivot) {
                j--;
            }

            // Если мы нашли значение в левом списке, которое больше,
            // чем опорный элемент, и если мы нашли значение в правом списке
            // который меньше, чем опорный элемент, тогда мы обмениваем значения.
            // Когда мы закончим, мы можем увеличить i и j
            if (i <= j) {
                exchange = students[i];
                students[i] = students[j];
                students[j] = exchange;
                i++;
                j--;
            }
        }
        // Рекурсия
        if (low < j)
            quickSort(students, low, j);
        if (i < high)
            quickSort(students, i, high);
    }

}