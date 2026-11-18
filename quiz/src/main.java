import java.util.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a hacer un quiz de preguntas sobre League of Legends :)");
        System.out.println("Responde si son Verdadero (V) o Falso (F)");
        System.out.println("Preparado? (Pon: Si o No)");

        String jugar;
        boolean si_no;

        do {
            jugar = sc.next().toLowerCase();
            si_no = jugar.equals("si") || jugar.equals("no");
            if (!si_no){
                System.out.println("Eso no es ni Si ni No... Un poco dislexico por tu parte no pasa nada... Va venga! Quieres hacer el quiz?... ");
            }
        }while (!si_no);
        if (jugar.equals("si")) {
            System.out.println();
            int puntos = 0;


            String respuesta;
            boolean valida;

            System.out.println("\n");
            System.out.println("PRIMERA PREGUNTA:");
            System.out.println("1. En la región de Demacia, la práctica y el uso de la magia están estrictamente prohibidos y son perseguidos por los Cazadores de Magos. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);

            if (respuesta.equals("verdadero") || respuesta.equals("v")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("Demacia mantiene una arraigada fobia y rechazo a la magia tras las antiguas Guerras Rúnicas, y los Cazadores de Magos vigilan y encarcelan a quienes la poseen.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("La magia está terminantemente prohibida en Demacia; de hecho, utilizan la petricita para neutralizarla.");
            }

            System.out.println("\n");
            System.out.println("SEGUNDA PREGUNTA:");
            System.out.println("2. Jinx y Vi son reconocidas oficialmente en el canon actual de Runaterra como hermanas.(V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);

            if (respuesta.equals("verdadero") || respuesta.equals("v")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("El lore actual y la serie Arcane confirman plenamente que Jinx (Powder) y Vi (Violet) son hermanas.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("Sí son hermanas (Powder y Violet), un dato confirmado tanto en el canon actual como en la serie Arcane.");
            }

            System.out.println("\n");
            System.out.println("TERCERA PREGUNTA:");
            System.out.println("3. La pasiva de Kindred (\"Marca de los Kindred\") solo puede marcar a campeones enemigos y nunca a monstruos de la jungla. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);
            if (respuesta.equals("falso") || respuesta.equals("f")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("Kindred puede marcar tanto a campeones enemigos como a diversos campamentos de monstruos neutrales de la jungla para obtener acumulaciones.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("Los monstruos de la jungla (como el Cangrejo Escurridizo o los Raptores) son objetivos clave de la marca de Kindred.");
            }

            System.out.println("\n");
            System.out.println("CUARTA PREGUNTA:");
            System.out.println("4. El objeto \"Sombrero Mortal de Rabadon\" aumenta tu Poder de Habilidad (AP) total en un porcentaje fijo. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);
            if (respuesta.equals("verdadero") || respuesta.equals("v")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("Su pasiva única (\"Apocalipsis\") incrementa tu Poder de Habilidad total en un porcentaje (actualmente un 30%).");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("La pasiva única de Rabadon escala precisamente multiplicando tu AP total de forma porcentual.");
            }

            System.out.println("\n");
            System.out.println("QUINTA PREGUNTA:");
            System.out.println("5. El Alma del Dragón de Montaña otorga un escudo persistente que se regenera automáticamente tras un breve periodo sin recibir daño. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);
            if (respuesta.equals("verdadero") || respuesta.equals("v")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("El Alma de Montaña concede un escudo que vuelve a generarse tras no recibir daño de campeones o monstruos épicos durante unos segundos.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("Esa es exactamente la recompensa defensiva que otorga el Alma del Dragón de Montaña.");
            }

            System.out.println("\n");
            System.out.println("SEXTA PREGUNTA:");
            System.out.println("6. Xerath ayudó a Azir a ascender en el Disco Solar de Shurima con intenciones puras de lealtad y amistad eterna. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);
            if (respuesta.equals("falso") || respuesta.equals("f")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("Xerath traicionó a Azir durante el ritual en Shurima por ambición, rencor y el deseo de acabar con la esclavitud a su manera.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("Las intenciones de Xerath eran de profunda traición: usurpó el ritual de Ascensión para robar el poder divino para sí mismo.");
            }

            System.out.println("\n");
            System.out.println("SÉPTIMA PREGUNTA:");
            System.out.println("7. La habilidad definitiva (R) de Tryndamere le hace inmune a la muerte y le impide bajar de 1 de vida durante su duración. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);
            if (respuesta.equals("verdadero") || respuesta.equals("v")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("\"Furia inmortal\" garantiza que Tryndamere no pueda morir y mantenga al menos 1 punto de vida mientras la habilidad esté activa.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("La definitiva de Tryndamere sí evita que baje de 1 de vida, dándole segundos críticos para pelear o escapar.");
            }

            System.out.println("\n");
            System.out.println("OCTAVA PREGUNTA:");
            System.out.println("8. Las frutas de miel (Honeyfruit) que aparecen en el río otorgan exclusivamente vida y una pequeña cantidad de maná al consumirlas. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);
            if (respuesta.equals("falso") || respuesta.equals("f")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("Al recoger una Mielmiel te ralentizas ligeramente durante una fracción de segundo, lo que puede costar caro si te persiguen.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("Aunque curan vida y restauran maná, también te aplican una pequeña ralentización (slow) momentánea en el movimiento.");
            }

            System.out.println("\n");
            System.out.println("NOVENA PREGUNTA:");
            System.out.println("9. Los Inhibidores destruidos en la base enemiga se quedan rotos para siempre y jamás vuelven a regenerarse durante la partida. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);
            if (respuesta.equals("falso") || respuesta.equals("f")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("Los inhibidores no son permanentes; tras 5 minutos de haber sido destruidos, vuelven a levantarse.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("Los inhibidores se regeneran automáticamente después de 5 minutos, aunque las súper oleadas ya hayan causado daño.");
            }

            System.out.println("\n");
            System.out.println("DECIMA PREGUNTA:");
            System.out.println("10. Swain, el Gran General de Noxus, alberga en su cuerpo al demonio cuervo conocido como Raum. (V / F)");
            do {
                respuesta = sc.next().toLowerCase();
                valida = respuesta.equals("verdadero") || respuesta.equals("v") || respuesta.equals("falso") || respuesta.equals("f");
                if (!valida) {
                    System.out.println("Eso no es ni Verdadero ni Falso... Te doy otra oportunidad... Responde otra vez pofis (•̀o•́)ง");
                }
            } while (!valida);
            if (respuesta.equals("verdadero") || respuesta.equals("v")) {
                System.out.println("Correcto, Muy Bien :)");
                System.out.println("Tras los sucesos en las Islas de la Sombra y el cambio de poder en Noxus, Swain pactó con Raum, convirtiéndolo en parte de su nueva identidad.");
                puntos++;
            } else {
                System.out.println("Incorrecto :(");
                System.out.println("Raum es efectivamente el demonio de los secretos que habita en Swain y le otorga sus poderes y visión.");
            }


            System.out.println("Tu resultado es: " + puntos + " puntos");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠶⢛⡿⠟⠉⣁⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠉⠀⣴⡿⢖⡿⠿⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢶⡟⠀⠀⠸⡫⠞⠛⠚⠉⠉⠙⠓⠲⢦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⡏⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⢧⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡈⠳⡀⠀⠀⠀⠀⠀⠀⠀⣀⣴⠞⢋⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⢹\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣤⣤⣤⣬⣧⣀⡀⠀⠀⠠⠤⠖⠒⠛⠛⠒⣺⠟⠁⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⣸⠃⠀⣸\n" +
                    "⢰⡷⢶⣦⣄⣀⠀⠀⠀⣠⣴⠾⠛⠉⠉⠀⠀⠀⠀⠈⠉⠛⠿⣶⣄⠀⠰⣦⣶⣶⡋⢁⣴⢷⠶⢄⡀⠀⠀⠸⣿⣲⠏⠳⠦⣴⡏⠀⠀⡟\n" +
                    "⢸⡇⣷⡦⣈⠙⢓⣶⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣦⡹⡟⠦⠀⣽⠳⣄⠓⠤⣽⢤⣄⣰⠃⠉⠓⠦⣞⡿⠁⠀⢠⡇\n" +
                    "⠸⡇⡇⠁⠈⢱⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣷⡀⠀⡏⠀⠈⠓⠾⣧⠞⠉⠙⠳⢦⣄⡴⢺⠇⠀⠀⣼⠀\n" +
                    "⠀⣷⢳⠀⣰⢋⣭⣙⣓⠶⢦⣄⣀⠀⠀⠀⢀⣀⣀⣀⣤⠤⠤⠤⠤⠤⣤⡀⠹⣧⢰⡇⠀⠀⠀⣼⠋⠀⠀⠀⠀⠀⠈⣹⣿⠀⠀⢰⠇⠀\n" +
                    "⠀⠸⣟⣴⢯⢎⠏⢰⠏⢀⠏⢠⡿⠁⠀⣟⢹⢉⡤⣤⣄⣒⣒⣒⣒⣲⡆⢻⠀⠹⣿⠃⠀⠀⡼⠃⠀⠀⠀⠀⠀⣠⡞⢡⡇⠀⢀⡟⠀⠀\n" +
                    "⠀⠀⢻⣿⡟⡞⢀⠎⠀⡞⢀⣞⣀⡀⠀⢹⠘⡄⣏⠉⠉⠀⠀⠀⠀⠘⣾⠘⣇⣀⣿⠀⠀⣼⠃⠀⠀⠀⠀⢀⡾⠋⠀⣼⠀⢀⣾⠁⠀⠀\n" +
                    "⠀⠀⡟⢸⣸⠀⡞⢀⠞⢀⡟⠀⠀⠉⠉⢹⡄⡇⢸⠀⠀⠀⠀⠀⠀⠀⢧⡆⣇⠀⢸⠀⡼⠁⠀⠀⠀⠀⣴⠟⢬⡙⢲⡇⠀⡾⠃⠀⠀⠀\n" +
                    "⠀⠸⣧⣤⣈⣉⣁⡞⠀⡾⠉⠓⠒⠒⠒⠺⡇⢸⠈⠧⠒⠒⠒⠈⢉⣉⣉⣁⡟⠉⢹⣴⠃⠀⠀⠀⢠⡾⠃⠀⠀⠙⡾⠀⣼⠃⠀⠀⠀⠀\n" +
                    "⠀⣴⠞⠁⠀⠉⠉⠙⠛⠁⠀⠀⠀⠀⠀⠀⠻⠞⠓⠒⠚⠛⠛⠉⠉⠉⠉⠉⣀⣠⣴⠟⠁⠀⠀⢠⡟⠀⠀⠀⠀⣰⠇⣰⠃⠀⠀⠀⠀⠀\n" +
                    "⠀⠈⠉⠛⢶⠶⣶⡶⣤⣤⣀⣀⣀⣀⣀⣀⣠⣀⣀⣀⣀⣤⠤⠶⠶⡶⠚⠋⠉⠳⣞⣀⡀⠀⣰⠏⠀⠀⠀⠀⣠⡟⢠⡇⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠠⣴⣻⣰⠋⠳⣄⠘⡆⠀⠀⠀⢸⠁⣠⠞⠉⠉⠙⠲⢄⠀⠀⣱⠀⠀⠀⢉⣩⣷⣶⣿⠏⠀⠀⠀⣠⢾⣏⣀⣸⡇⠀⠀⠀⠀⠀⠀\n" +
                    "⢐⣶⡶⠍⠀⠑⢄⠀⠈⢦⠇⠀⠀⠀⢸⠚⠁⠀⠀⠀⠀⠀⠀⣁⠔⠁⠀⠀⣀⣤⣶⣏⣡⠏⠀⢀⣰⠞⠃⢸⠀⢉⡿⠁⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠻⢿⡦⠄⠀⠀⠉⠲⣺⠋⠙⠒⠦⣌⠳⠦⠤⠴⠶⠖⠚⠉⠀⠀⠀⠀⣠⣞⡉⠀⠈⠉⠉⢳⠞⢉⢦⡄⡾⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠙⢷⣄⠀⠀⠀⠙⠒⠤⢤⠴⠊⠀⣀⠴⠂⠀⠀⠀⠀⠀⠀⣠⡾⣿⣿⣶⣤⢀⣀⣤⢿⣉⣵⠞⣹⠃⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣙⣶⣤⣀⠈⠑⠒⠒⠶⠒⠊⠁⠀⠀⠀⠀⠀⢀⣠⠾⠋⠀⠰⣭⣟⣧⡸⢯⡉⠻⣍⠀⣰⡏⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢀⣤⢾⡿⡉⠀⠉⢙⠳⠶⠶⢶⣤⣤⣤⣤⠤⠶⠶⠞⠋⠁⠀⢀⠀⣿⣮⣳⡈⢻⠀⠷⢦⣼⣶⣿⠀⢠⣧⣀⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢰⠏⠀⣸⣺⠁⢀⣴⣏⡆⠀⠀⢒⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢸⣄⡿⡇⠉⠁⣸⠀⠀⣸⡏⠀⠈⣟⠋⠀⣉⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⣿⠀⠀⠁⢧⡶⠉⢸⡼⣇⣆⠠⡘⢧⡀⠀⡀⠀⡀⠀⢀⠆⢠⣧⡟⠟⠁⠁⢀⣴⠃⠀⢠⠟⠁⠀⣰⡇⠀⢐⠟⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠈⠳⣤⣠⡟⠀⠀⠈⠁⠹⠟⣄⣏⡆⢳⣄⢘⣄⣸⣤⣾⣾⠉⣫⣶⡿⢿⣷⣋⡀⠀⠰⡻⢶⠶⣞⣁⡠⠄⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢰⡞⠉⢻⣆⠀⠀⠀⠀⠀⠀⠈⠛⣫⣟⣼⣯⠾⠛⠛⠉⢹⡋⠉⠀⠀⠀⠀⠹⣯⣻⠾⠒⢺⡗⢦⣤⠤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠈⠳⣄⡀⢹⡶⢦⣄⣀⠀⠀⠀⢀⡽⠳⡄⠈⢣⡀⠀⠀⠈⣷⣄⣠⢤⣔⣦⠴⠟⠁⠀⠀⣼⢡⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠈⠉⢻⢿⡷⢶⣮⢍⣉⣛⡟⠀⠀⠙⣆⠀⢧⡀⠀⠀⢘⡶⠛⣏⣵⠀⠀⠀⠀⢀⡼⠃⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠸⣌⠓⠤⣌⣉⣉⣲⣷⡀⠀⠀⢹⢂⢸⣘⡾⠛⠉⣠⠞⠁⡇⠀⠀⠀⠀⡿⠤⣄⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠙⣦⠀⠀⠉⣩⠟⠁⠙⠓⠒⢞⣟⣼⠛⣊⡤⠞⠁⠀⢸⠃⠀⠀⠀⠀⡇⠀⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⣰⠋⢁⡀⢰⠃⠀⠀⠀⠀⠀⠈⠉⠉⠫⡁⠀⠀⠀⠀⡾⠀⠀⠀⠀⢀⡇⢰⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⢠⣾⠥⠒⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡀⠀⢰⡇⠀⠀⠀⠀⡼⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀⠙⢦⡀⠀⡼⠁⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠲⠶⠶⠿⢾⠃⠀⠀⣿⠀⣀⠀⣀⣀⣀⣀⡀⣀⣀⡀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣄⣀⣴⠏⠀⠙⠘⠒⠓⠂⠢⠕⢚⠛⠳⠦⠄⠀⠀⠀");
            System.out.println("Gracias por participar <3");

        } else {
            System.out.println("Vaya que pena, vuelve cuando estes listo :3");
        }
    sc.close();
    }
}

