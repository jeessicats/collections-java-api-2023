package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPornome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPornome.add(c);
            }
        }
        return contatosPornome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Jessica", 131773);
        agendaContatos.adicionarContato("Jessica Teixeira", 131873);
        agendaContatos.adicionarContato("Jessica Ivanko", 185773);
        agendaContatos.adicionarContato("Daniel Pereira", 138363);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Daniel"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Daniel Pereira", 28377237));

        agendaContatos.exibirContatos();
    }
}
