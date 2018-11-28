package viktorrocha.br.com.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aluno);

        String[] alunos = {"Thais","Gizelly", "Rute", "Marcia","Samona","Yaminny","Dandara","Silvia","Anne","Karol","Iza Hendee","Jhully"};
        ListView  listaAlunos = findViewById(R.id.lista_alunos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);

        listaAlunos.setAdapter(adapter);

       Button novoAluno =  findViewById(R.id.novo_aluno);
       novoAluno.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intentVaiProFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
               startActivity(intentVaiProFormulario);
           }
       });

    }
}
