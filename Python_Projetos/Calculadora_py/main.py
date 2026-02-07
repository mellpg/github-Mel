
# importa a classe Calculadora do arquivo calculadora.py
from calculadora import Calculadora


def main():
    # cria um objeto da classe Calculadora
    # agora temos acesso a todos os métodos
    calc = Calculadora()

    while True:
        # menu de operações disponíveis
        print("\n=== CALCULADORA ===")
        print("soma")
        print("subtracao")
        print("multiplicacao")
        print("divisao")
        print("media")
        print("porcentagem")
        print("resto")
        print("sair")

        # usuário escolhe a operação
        operacao = input("Escolha a operação: ").lower()

        # condição de saída do programa
        if operacao == "sair":
            print("Encerrando a calculadora.")
            break

        # porcentagem e resto exigem exatamente 2 valores
        if operacao in ["porcentagem", "resto"]:
            try:
                a = float(input("Digite o primeiro valor: "))
                b = float(input("Digite o segundo valor: "))

                # chama o método calcular da calculadora
                resultado = calc.calcular(operacao, a, b)

                print("Resultado:", resultado)

            except ValueError:
                # trata erro caso o usuário digite algo não numérico
                print("Erro: digite apenas números")

        else:
            # para as demais operações, aceita vários números
            try:
                entrada = input(
                    "Digite os números separados por espaço: "
                )

                # converte a entrada em uma lista de floats
                numeros = [float(n) for n in entrada.split()]

                # desempacota a lista com *
                resultado = calc.calcular(operacao, *numeros)

                print("Resultado:", resultado)

            except ValueError:
                print("Erro: digite apenas números")

            except ZeroDivisionError:
                print("Erro: divisão por zero")


# garante que o main só roda se este arquivo for executado diretamente
if __name__ == "__main__":
    main()
