package mybasic.l09_poo.exercises2_poo_modifiers;

// 6. Crea una clase User con los atributos privados username y password.
// Implementa los métodos setUsername(String username), setPassword(String
// password) y checkPassword(String inputPassword) que compare contraseñas.
public class User {
    // Attributes
    private String userName;
    private String password;
    // Constructor
    public User (String userName, String password) {
        this.setUserName(userName);
        this.setPassword(password);
    }
    // Getters
    public String getUserName() {
        return userName;
    }
    // Setters
    public void setUserName(String userName) {
        if (userName != null && !userName.trim().isEmpty()) {
            this.userName = userName;
        } else {
            System.out.println("El usuario no puede estar vacío");
        }
    }

    public void setPassword(String password) {
        // Verificar que el password no sea null
        if (password == null) {
            System.out.println("El password no puede ser vacío");
            return;
        }
        // Verificar que no sea igual al nombre de usuario
        if (password.equals(userName)) {
            System.out.println("No puedes usar como password el mismo nombre de usuario");
            return;
        }
        // Verificar longitud
        if (password.length() < 8 || password.length() > 20) {
            System.out.println("El password debe tener entre 8 y 20 caracteres");
            return;
        }
        // Verificar que cumple con el patrón de seguridad
        String patron = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        if (!password.matches(patron)) {
            System.out.println("El password debe tener al menos: una letra minúscula, una mayúscula, un número y un símbolo especial (@#$%^&+=)");
            return;
        }
        // Sí pasa todas las validaciones, asignar el password
        this.password = password;
        System.out.println("Password establecido correctamente");
    }

    /**
     * Método_ para verificar si la contraseña ingresada coincide con la almacenada
     * @param inputPassword La contraseña a verificar
     * @return true si la contraseña es correcta, false en caso contrario
     */
    public boolean checkPassword(String inputPassword) {
        // Verificar que el input no sea null
        if (inputPassword == null) {
            System.out.println("La contraseña ingresada no puede ser null");
            return false;
        }
        // Verificar que el password actual no sea null (usuario válido)
        if (this.password == null) {
            System.out.println("No hay contraseña establecida para este usuario");
            return false;
        }
        // Comparar las contraseñas
        if (this.password.equals(inputPassword)) {
            System.out.println("Contraseña correcta");
            return true;
        } else {
            System.out.println("Contraseña incorrecta");
            return false;
        }
    }

    // Método_ adicional útil para debugging (opcional)
    @Override
    public String toString() {
        return "User{userName='" + userName + "', hasPassword=" + (password != null) + "}";
    }
}