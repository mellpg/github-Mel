
class Calculadora:
    # A classe agrupa todas as operações da calculadora

    def soma(self, *nums):
        # *nums permite receber uma quantidade variável de números
        # Exemplo: soma(1, 2, 3, 4)

        total = 0  # acumulador da soma

        for n in nums:
            total += n  # soma acumulada

        return total

    def subtracao(self, *nums):
        # começa pelo primeiro número
        resultado = nums[0]

        for n in nums[1:]:
            resultado -= n  # subtrai um por um

        return resultado

    def multiplicacao(self, *nums):
        # começa com 1 (elemento neutro da multiplicação)
        resultado = 1

        for n in nums:
            resultado *= n  # multiplica os valores

        return resultado

    def divisao(self, *nums):
        # começa pelo primeiro número
        resultado = nums[0]

        for n in nums[1:]:
            if n == 0:
                # evita erro de divisão por zero
                return "Erro: divisão por zero"

            resultado /= n  # divide sequencialmente

        return resultado

    def media(self, *nums):
        # reutiliza o método soma da própria classe
        return self.soma(*nums) / len(nums)

    def porcentagem(self, percentual, valor):
        # Calcula X% de Y
        # Exemplo: porcentagem(10, 200) → 20

        return (percentual / 100) * valor

   
    def resto_divisao(self, a, b):
        # Retorna o resto da divisão inteira
        # Exemplo: resto_divisao(10, 3) → 1

        if b == 0:
            return "Erro: divisão por zero"

        return a % b

    def calcular(self, operacao, *nums):
        # dicionário que relaciona o nome da operação
        # com o método correspondente
        operacoes = {
            "soma": self.soma,
            "subtracao": self.subtracao,
            "multiplicacao": self.multiplicacao,
            "divisao": self.divisao,
            "media": self.media,
            "porcentagem": self.porcentagem,
            "resto": self.resto_divisao
        }

        if operacao not in operacoes:
            return "Operação inválida"

        # porcentagem e resto precisam EXATAMENTE de dois valores
        if operacao in ["porcentagem", "resto"] and len(nums) != 2:
            return f"A operação '{operacao}' exige 2 valores"

        if len(nums) == 0:
            return "Nenhum número informado"

        # chamada dinâmica do método correto
        return operacoes[operacao](*nums)
