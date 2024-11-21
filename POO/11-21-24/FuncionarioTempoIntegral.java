class FuncionarioTempoIntegral extends Funcionario
{
    private int horasSemanais;

    public FuncionarioTempoIntegral(String nome, float salario)
    {
        super(nome, salario);
        this.horasSemanais = 44;
    }

    public int getNumeroHorasSemanais()
    {
        return this.horasSemanais;
    }
}