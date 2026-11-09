
package exercicioIfEElse;

import java.util.Locale; // Traz a ferramenta que define o formato dos numeros, como escolher o formato das etiquetas.
import java.util.Scanner; // Traz a ferramenta para ler o teclado, como um atendente recebendo respostas.

public class exIfEElse { // Abre a classe Main: a estrutura que agrupa o programa, como a loja abriga o atendimento.

    public static void main(String[] args) { // Ponto onde Java inicia o programa, como abrir o caixa; args nao sera usado aqui.

        Scanner scanner = new Scanner(System.in); // Cria o leitor chamado scanner; System.in representa a entrada pelo teclado.
        scanner.useLocale(Locale.US); // Configura numeros com ponto decimal: digite 1500.50, sem separador de milhar.

        System.out.println("===== SISTEMA DE COMPRAS ====="); // Mostra o titulo e pula uma linha, como exibir a placa do caixa.
        System.out.println("Use ponto nos valores decimais. Exemplo: 1500.50"); // Orienta o cliente a preencher os valores.

        System.out.print("Digite seu nome: "); // Mostra a pergunta sem pular linha; a resposta fica ao lado.
        String nome = scanner.nextLine(); // String guarda texto; nextLine le a linha inteira. Exemplo: Ana Silva.

        System.out.print("Digite sua idade: "); // O atendente pergunta a idade do cliente.
        int idade = scanner.nextInt(); // int guarda numero inteiro; nextInt le esse tipo. Exemplo: 25.
        scanner.nextLine(); // Consome o restante da linha e o Enter deixado por nextInt, evitando pular o nome do produto.

        System.out.print("Digite o produto: "); // O atendente pergunta qual produto o cliente quer.
        String produto = scanner.nextLine(); // Guarda o nome completo, inclusive espacos. Exemplo: Notebook Gamer.

        System.out.print("Digite o preco unitario: "); // Pergunta o preco de uma unidade, como consultar a etiqueta.
        double preco = scanner.nextDouble(); // double guarda numeros com casas decimais; nextDouble le esse tipo. Exemplo: 3000.50.

        System.out.print("Digite a quantidade desejada: "); // Pergunta quantas unidades o cliente deseja levar.
        int quantidade = scanner.nextInt(); // Guarda uma quantidade inteira. Exemplo: 2 notebooks.

        System.out.print("Digite o estoque disponivel: "); // Pergunta quantas unidades existem na loja.
        int estoque = scanner.nextInt(); // Guarda o estoque informado. Exemplo: 5 notebooks na prateleira.

        System.out.print("Digite seu saldo: "); // Pergunta quanto dinheiro o cliente tem disponivel.
        double saldo = scanner.nextDouble(); // Guarda o saldo informado. Exemplo: 10000.00.

        System.out.print("Pagamento aprovado? (true/false): "); // Pede a autorizacao: true significa sim; false significa nao.
        boolean pagamentoAprovado = scanner.nextBoolean(); // boolean guarda verdadeiro ou falso, como um campo sim/nao na ficha.

        System.out.print("Sistema disponivel? (true/false): "); // Pergunta se o sistema da loja esta funcionando.
        boolean sistemaDisponivel = scanner.nextBoolean(); // Guarda true ou false, como registrar se o caixa esta disponivel.

        double valorTotal = preco * quantidade; // * multiplica: preco 3000 vezes quantidade 2 resulta em total 6000.
        double saldoRestante = saldo - valorTotal; // Subtrai o total do saldo: 10000 menos 6000 resulta em 4000 previstos.
        boolean compraAprovada = false; // Comeca sem aprovacao, como um pedido aguardando conferencia.
        String motivo = ""; // Deixa o motivo vazio, como um campo ainda nao preenchido na ficha.

        System.out.printf(Locale.US, "%nValor total da compra: R$ %.2f%n", valorTotal); // printf insere o valor; %.2f mostra duas casas decimais; %n pula linha.
        System.out.printf(Locale.US, "Saldo previsto apos a compra: R$ %.2f%n", saldoRestante); // Mostra uma previsao; calcular esse saldo ainda nao aprova a compra.

        if (idade < 0 || preco <= 0 || quantidade <= 0 || estoque < 0 || saldo < 0) { // if significa SE; || significa OU: basta um desses dados estar invalido.

            System.out.println("\n==========================="); // \n pula uma linha; os sinais desenham a borda do aviso.
            System.out.println("      DADOS INVALIDOS"); // Mostra o aviso de preenchimento incorreto.
            System.out.println("==========================="); // Desenha outra borda para destacar o aviso.
            System.out.println("Existem informacoes incorretas."); // Explica que algum numero desrespeita as regras.
            System.out.println("A compra nao pode continuar."); // Impede a aprovacao, mas o relatorio ainda sera mostrado.
            motivo = "Dados invalidos"; // Anota o motivo na ficha para mostrar depois.

        } else if (!sistemaDisponivel) { // else if significa SENAO, SE; ! significa NAO: verifica se o sistema esta indisponivel.
            motivo = "Sistema indisponivel"; // Registra a primeira falha da compra, como anotar que o caixa esta fora de funcionamento.

        } else if (idade < 18) { // So chega aqui se as verificacoes anteriores passaram; 17 recusa e 18 passa nesta regra.
            motivo = "Cliente menor de idade"; // Anota a recusa porque o cliente nao atingiu a idade minima.

        } else if (quantidade > estoque) { // > significa MAIOR QUE: pedir 6 unidades quando existem 5 causa recusa.
            motivo = "Estoque insuficiente"; // Anota que faltam produtos na prateleira.

        } else if (saldo < valorTotal) { // < significa MENOR QUE: ter 5000 para uma compra de 6000 causa recusa.
            motivo = "Saldo insuficiente"; // Anota que falta dinheiro para pagar.

        } else if (!pagamentoAprovado) { // Verifica se a autorizacao esta falsa, como conferir um pagamento negado.
            motivo = "Pagamento nao autorizado"; // Anota que o pagamento nao recebeu autorizacao.

        } else { // else significa SENAO: so entra aqui quando nenhuma das falhas anteriores ocorreu.
            compraAprovada = true; // Marca a compra como aprovada, como colocar o carimbo de aprovacao na ficha.
            System.out.println("\n============================"); // Abre a borda da mensagem de sucesso.
            System.out.println("     COMPRA APROVADA!"); // Informa a aprovacao.
            System.out.println("============================"); // Fecha a borda da mensagem.
            System.out.println("Todos os requisitos atendidos."); // Confirma que todas as regras passaram.
            System.out.println("Pedido realizado com sucesso!"); // Mostra a mensagem de sucesso exigida no exercicio.
        } // Fecha a sequencia de decisoes; agora o programa segue para o relatorio.

        System.out.println("\n===================================="); // Inicia o relatorio, como abrir o comprovante do atendimento.
        System.out.println("       RELATORIO DE COMPRA"); // Mostra o titulo do comprovante.
        System.out.println("===================================="); // Separa o titulo dos dados.

        System.out.println("Cliente: " + nome); // + junta o texto com o nome. Exemplo: Cliente: Ana.
        System.out.println("Idade: " + idade + " anos"); // Junta o texto com a idade. Exemplo: Idade: 25 anos.
        System.out.println("\nProduto: " + produto); // Pula uma linha e mostra o produto solicitado.
        System.out.printf(Locale.US, "Preco unitario: R$ %.2f%n", preco); // Mostra o preco de uma unidade com duas casas decimais.
        System.out.println("Quantidade: " + quantidade); // Mostra quantas unidades o cliente pediu.
        System.out.printf(Locale.US, "Valor total: R$ %.2f%n", valorTotal); // Mostra o total calculado, como no comprovante do caixa.
        System.out.println("------------------------------------"); // Separa os dados da compra do resultado.

        if (compraAprovada) { // Consulta a aprovacao guardada; entra aqui se compraAprovada for true.
            System.out.println("STATUS: COMPRA APROVADA"); // Imprime o resultado aprovado no comprovante.
            System.out.println("------------------------------------"); // Desenha uma separacao antes dos saldos.
            System.out.printf(Locale.US, "Saldo anterior: R$ %.2f%n", saldo); // Mostra o saldo informado antes da compra.
            System.out.printf(Locale.US, "Saldo restante: R$ %.2f%n", saldoRestante); // Mostra quanto sobraria com a compra aprovada.

        } else { // Se compraAprovada for false, usa este caminho para mostrar a recusa.
            System.out.println("STATUS: COMPRA RECUSADA"); // Imprime o resultado recusado no comprovante.
            System.out.println("------------------------------------"); // Desenha uma separacao antes da justificativa.
            System.out.println("Motivo: " + motivo); // Mostra a primeira falha registrada, como consultar a anotacao do atendente.
        } // Fecha a escolha entre mostrar aprovacao ou recusa.

        System.out.println("===================================="); // Desenha a borda final do comprovante.
        scanner.close(); // Fecha o leitor de entrada, como encerrar o atendimento pelo teclado.

    } // Fecha o metodo main, que contem a sequencia executada ao iniciar o programa.
} // Fecha a classe Main, que agrupa o programa inteiro.