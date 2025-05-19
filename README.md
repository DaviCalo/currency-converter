# Conversor de Moedas

Este projeto é um conversor de moedas em Java que permite a conversão entre diferentes moedas utilizando uma API de consulta de valores. O programa recebe valores do usuário via entrada padrão e realiza a conversão com base nas taxas obtidas através da API.

## 📌 Funcionalidades

- Conversão de **Dólar Americano (USD)** para **Peso Argentino (ARS)** e vice-versa.
- Conversão de **Dólar Americano (USD)** para **Real Brasileiro (BRL)** e vice-versa.
- Conversão de **Dólar Americano (USD)** para **Peso Colombiano (COP)** e vice-versa.
- Interface interativa via **entrada do usuário**.
- Uso de uma API para obter taxas de câmbio em tempo real.

## ⚙️ Tecnologias Utilizadas

- **Java** para lógica de programação.
- **Scanner** para entrada do usuário.
- **API de consulta de moedas** para obtenção das taxas de câmbio.
- **Estruturas condicionais** (`switch-case`) para controle de fluxo.

## 🚀 Como Usar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
   ```
2. Compile o código:
   ```bash
   javac ConversorMoedas.java
   ```
3. Execute o programa:
   ```bash
   java ConversorMoedas
   ```
4. Escolha a moeda que deseja converter e insira o valor desejado.

## 🛠 Estrutura do Código

- `Scanner leitura` → Captura entradas do usuário.
- `ApiConnection api` → Responsável por consultar os valores na API externa.
- `Converter converter` → Manipula os cálculos e conversão das moedas.
- `Symbol` → Enum com os símbolos das moedas suportadas.
- `Choose` → Classe que exibe opções e solicita entrada do usuário.

## ✨ Melhorias Futuras

- Suporte a mais moedas.
- Interface gráfica para interação amigável.
- Implementação de um histórico de conversões.
- Integração com API REST para consultas mais eficientes.

## 📝 Licença

Este projeto está disponível sob a licença **MIT**. Fique à vontade para contribuir!