package com.example._6singletontarea_refactorguru;

public class Singleton {

    // 1. Crear una instancia privada y estática (volátil)
    private static Singleton instance;

    // 2. Hacer el constructor privado para evitar instanciación externa
    private Singleton() {
        // Constructor privado para evitar que se cree una instancia fuera de la clase
    }

    // 3. Proveer un método público estático para obtener la instancia
    public static Singleton getInstance() {
        // 4. Sincronización para asegurarse de que solo se cree una vez en un entorno multihilo
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
