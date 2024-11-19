   <h1>Gerenciamento de Conta Bancária em Java</h1>
    <p>
        Este projeto implementa uma simulação de gerenciamento de conta bancária em Java, permitindo a criação de contas, 
        realização de depósitos, saques e exibição de saldo. O código está estruturado em duas classes principais: 
        <strong>Main</strong> e <strong>contaBancaria</strong>.
    </p>
    <h2>Estrutura do Código</h2>
    <h3>Classe <code>Main</code></h3>
    <p>
        A classe <strong>Main</strong> é responsável pela interação com o usuário por meio do console. Ela utiliza a classe 
        <strong>contaBancaria</strong> para realizar operações bancárias. O fluxo principal da aplicação ocorre nesta classe, 
        que executa as seguintes etapas:
    </p>
    <h4>Criação da Conta:</h4>
    <ul>
        <li>Solicita o nome do titular e o valor inicial da conta.</li>
        <li>Instancia um objeto da classe <code>contaBancaria</code> utilizando os dados fornecidos pelo usuário.</li>
    </ul>
    <h4>Operações Bancárias:</h4>
    <ul>
        <li>Pergunta ao usuário se deseja realizar um depósito.</li>
        <li>
            Caso positivo, solicita o valor a ser depositado e atualiza o saldo chamando o método 
            <code>depositar</code> da classe <code>contaBancaria</code>.
        </li>
        <li>Pergunta ao usuário se deseja realizar um saque.</li>
        <li>
            Caso positivo, solicita o valor a ser sacado e atualiza o saldo chamando o método 
            <code>sacar</code> da classe <code>contaBancaria</code>.
        </li>
    </ul>
    <h4>Finalização:</h4>
    <ul>
        <li>Exibe mensagens de confirmação para cada operação realizada e informa o saldo atualizado.</li>
    </ul>
    <h3>Classe <code>contaBancaria</code></h3>
    <p>
        A classe <strong>contaBancaria</strong> modela os atributos e comportamentos de uma conta bancária. Esta classe 
        encapsula os dados da conta e fornece métodos para manipulá-los de forma segura.
    </p>
    <h4>Atributos</h4>
    <ul>
        <li><code>titular</code> (String): Representa o nome do titular da conta.</li>
        <li><code>saldo</code> (int): Representa o saldo atual da conta.</li>
    </ul>
    <h4>Construtor</h4>
    <ul>
        <li>
            <code>contaBancaria(String titular, int saldo)</code>: Inicializa os atributos 
            <code>titular</code> e <code>saldo</code> com os valores fornecidos durante a criação da conta.
        </li>
    </ul>
    <h4>Métodos</h4>
    <ul>
        <li><code>getTitular()</code> e <code>setTitular(String titular)</code>: Métodos de acesso e modificação para o atributo <code>titular</code>.</li>
        <li><code>getSaldo()</code> e <code>setSaldo(int saldo)</code>: Métodos de acesso e modificação para o atributo <code>saldo</code>.</li>
        <li><code>depositar(int novoDeposito)</code>: Adiciona o valor fornecido ao saldo atual e retorna o saldo atualizado.</li>
        <li><code>sacar(int novoSaque)</code>: Deduz o valor fornecido do saldo atual e retorna o saldo atualizado.</li>
    </ul>
    <h2>Detalhes Importantes</h2>
    <h3>Interação com o Usuário</h3>
    <p>
        A interação é feita utilizando a classe <code>Scanner</code> para capturar entradas do usuário no console. 
        O fluxo de perguntas e respostas torna a aplicação dinâmica e responsiva às escolhas do usuário.
    </p>
    <h3>Encapsulamento</h3>
    <p>
        A classe <strong>contaBancaria</strong> implementa boas práticas de encapsulamento:
    </p>
    <ul>
        <li>Os atributos <code>titular</code> e <code>saldo</code> são privados, protegendo-os contra acessos diretos.</li>
        <li>Métodos públicos (<code>get</code> e <code>set</code>) permitem o acesso controlado aos atributos.</li>
    </ul>
    <h3>Reutilização de Código</h3>
    <p>
        Os métodos <code>depositar</code> e <code>sacar</code> são responsáveis por atualizar o saldo e retornar o valor atualizado. 
        Isso promove a reutilização do código e facilita a manutenção futura.
    </p>
    <h3>Fluxo de Operações</h3>
    <p>
        O fluxo do programa é sequencial e estruturado. Após criar a conta, o usuário tem a opção de realizar operações adicionais, 
        como depósitos e saques. O programa exibe mensagens informativas para confirmar as ações realizadas.
    </p>
