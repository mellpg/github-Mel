# Calculadora_Python
class Calculadora:
    # Classe que agrupa operações

    def soma(self, *nums):
        total = 0
        for n in nums:
            total += n
        return total

    def subtracao(self, *nums):
        resultado = nums[0]
        for n in nums[1:]:
            resultado -= n
        return resultado

    def multiplicacao(self, *nums):
        resultado = 1
        for n in nums:
            resultado *= n
        return resultado

    def divisao(self, *nums):
        resultado = nums[0]
        for n in nums[1:]:
            if n == 0:
                return "Erro: divisão por zero"
            resultado /= n
        return resultado

    def media(self, *nums):
        return self.soma(*nums) / len(nums)

    def porcentagem(self, percentual, valor):
        return (percentual / 100) * valor

    def resto(self, a, b):
        if b == 0:
            return "Erro: divisão por zero"
        return a % b

    def calcular(self, operacao, *nums):
        operacoes = {
            "soma": self.soma,
            "subtracao": self.subtracao,
            "multiplicacao": self.multiplicacao,
            "divisao": self.divisao,
            "media": self.media,
            "porcentagem": self.porcentagem,
            "resto": self.resto
        }

        if operacao not in operacoes:
            return "Operação inválida"

        if operacao in ["porcentagem", "resto"] and len(nums) !=2:
            return  f"A operação '{operacao}' exige 2 valores"

        if len(nums) == 0:
            return "Nenhum número informado"

        return operacoes[operacao](*nums)
        
            

        

        

        
