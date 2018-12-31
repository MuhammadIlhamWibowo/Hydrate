package com.sec.dev.hydrate.Question;

import java.util.ArrayList;

public class QuestionData {

    private ArrayList<QuestionModel> questionModels;

    public QuestionData() {
        questionModels = new ArrayList<>();
        questionModels.add(new QuestionModel("Dalam 3 atau 4 jam yang lalu apakah anda berolaharaga ?", 1, 0, 0));
        questionModels.add(new QuestionModel("Apakah anda merasa sangat haus  sekarang ?", 1, 0, 0));
        questionModels.add(new QuestionModel("Apakah pada tengkuk kepala anda terasa nyeri/sakit ?", 1, 0, 0));
        questionModels.add(new QuestionModel("Apakah sekarang badan anda terasa lesu ?", 1, 0, 0));
        questionModels.add(new QuestionModel("Apakah anda sedang mudah tersinggung atau sedang merasa bingung sekarang ?", 0, 2, 0));
        questionModels.add(new QuestionModel("Apakah anda berkeringat saat bekerja pada 1 atau 2 jam sebelum ini ?", 0, 2, 0));
        questionModels.add(new QuestionModel("Dalam kurun waktu 4 hari, apakah anda mengalami penurunan berat lebih dari 2 kg ?", 0, 0, 3));
        questionModels.add(new QuestionModel("Apakah suhu tubuh anda lebih dari 38 derajat Celcius ?", 0, 2, 0));
        questionModels.add(new QuestionModel("Apakah sekarang anda sedang merasa gelisah ?", 0, 2, 0));
        questionModels.add(new QuestionModel("Apakah air kencing anda berwarna kuning gelap ?", 0, 2, 0));
        questionModels.add(new QuestionModel("Apakah frekuensi buang air kecil anda kurang dari 2 kali sehari ?", 0, 2, 0));
        questionModels.add(new QuestionModel("Hitung denyut nadi anda dalam satu menit, apakah lebih dari 90 kali permenit ?", 0, 0, 3));
        questionModels.add(new QuestionModel("Tarik kulit anda ke arah atas, perhatikan dan hitung berapa lama kulit anda kembali pada kondisi semula. Apakah lebih dari 2 detik ?", 0, 0, 3));
        questionModels.add(new QuestionModel("Sekitar 1 atau 2 jam sebelumnya, apakah anda pingsan atau hampir pingsan ?", 0, 0, 3));
        questionModels.add(new QuestionModel("Coba berkaca pada cermin, lihat apakah mata anda terlihat cekung ?", 0, 0, 3));
        questionModels.add(new QuestionModel("Apakah tenggorokan anda terasa kering ?", 0, 2, 0));
    }

    public ArrayList<QuestionModel> getQuestionModels() {
        return  questionModels;
    }
}
