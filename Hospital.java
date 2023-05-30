package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float min = 32;
        float max = 40;
        float[] arr = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            float value = (float) Math.floor(Math.random() * (max - min + 1) + min);
            value = Math.round(value * 10);
            arr[i] = value / 10;
        }
        return arr;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        float averageTemperature = 0;
        int countOfHealthyPatients = 0;
        float value1;
        StringBuilder temperatures = new StringBuilder();
        for (int i = 0; i < temperatureData.length; i++) {
            float value2;
            averageTemperature += temperatureData[i];
            value2 = Math.round(temperatureData[i] * 10);
            temperatureData[i] = value2 / 10;
            if (i == temperatureData.length - 1) {
                temperatures.append(temperatureData[i]);
            } else {
                temperatures.append(temperatureData[i]).append(" ");
            }
            if (temperatureData[i] >= 36.2 && temperatureData[i] < 36.91) {
                countOfHealthyPatients++;
            }
        }
        averageTemperature = averageTemperature / temperatureData.length;
        value1 = Math.round(averageTemperature * 100);
        averageTemperature = value1 / 100;

        return "Температуры пациентов: " + temperatures +
                "\nСредняя температура: " + averageTemperature +
                "\nКоличество здоровых: " + countOfHealthyPatients;
    }}
