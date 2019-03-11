package com.example.vip.discursodelborracho;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.util.TypedValue.COMPLEX_UNIT_SP;

public class DiscursoDelSabioBorracho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discurso_del_borracho);
        TextView greeting = findViewById(R.id.greeting);

        String[] expres = {
                "Los niños son la esperanza del mundo.",
                "¡Somos hijos del maltrato!",
                "Lo cortés no quita lo valiente. Учтивость храбрости не помеха.",
                "¡A lo hecho pecho! Что сделано, то сделано.",
                "Estás arando en el mar. Ты пашешь песок. Чтобы выразить то, что человек занимается чем-то бесполезным.",
                "La trampa está dondequiera!",
                "¡Con la iglesia hemos topado!",
                "¡Todo tiene su porque!",
                "¡Causa y efecto!",
                "¡Deja que te coja! Ну погоди!",
                "¡Feliz navidad! ¡Feliz Fin de año y próspero año nuevo! ¡Felicidades!",
                "No hay mal que por bien no venga. Нет худа без добра.",
                "No quiero cantidad, quiero calidad.",
                "Todo en la vida tiene sus pros y sus contras.",
                "Lo que fue y ya no es, es como si nunca hubiera sido.",
                "Se ha metido en camisa de once varas.",
                "Vete para el manicomio!",
                "Más vale tarde que nunca. Лучше поздно, чем никогда.",
                "Una sola golondrina no hace verano.",
                "Al que madruga Dios le ayuda.",
                "¡Vete al diablo! Иди к черту!",
                "De tal palo tal astilla. Яблочко от яблоньки недалеко падает.",
                "¡Ya está bien! ¿no?",
                "No sólo de pan vive el hombre.",
                "La voluntad vale oro.",
                "¡Vete a freir esparragos!",
                "Más vale pájaro en mano que ciento volando.",
                "¡Donde pone el ojo pone la bala!",
                "Muchas gallinas pocos huevos."

        };

        int expresNum = expres.length;
        int randomNum1;
        int randomNum2;
        int randomNum3;

        // Получаем три различных случайных целых числа из отрезка [0, expresNum-1], не равных друг другу
        randomNum1 = (int)(Math.random()*expresNum);
        randomNum2 = (int)(Math.random()*expresNum);
        while (randomNum2 == randomNum1) {
            randomNum2 = (int)(Math.random()*expresNum);
        }
        randomNum3 = (int)(Math.random()*expresNum);
        while (randomNum3 == randomNum1 || randomNum3 == randomNum2) {
            randomNum3 = (int)(Math.random()*expresNum);
        }

        /*greeting.setText("Discurso del sabio borracho después del Año Nuevo Viejo\n\nAntes de nada, "
                + expres[randomNum1].toLowerCase()+"\n\nAdemás, "
                + expres[randomNum2].toLowerCase()+"\n\nPara concluir, "
                + expres[randomNum3].toLowerCase());*/
        greeting.setText(getResources().getString(R.string.speech, expres[randomNum1].toLowerCase(),
                expres[randomNum2].toLowerCase(), expres[randomNum3].toLowerCase()));
        greeting.setTextSize(COMPLEX_UNIT_SP, 30);

        Button button = findViewById(R.id.refresh_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                recreate();
            }
        });
    }
}
