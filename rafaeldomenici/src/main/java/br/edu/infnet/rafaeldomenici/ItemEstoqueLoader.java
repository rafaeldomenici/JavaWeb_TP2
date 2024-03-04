package br.edu.infnet.rafaeldomenici;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rafaeldomenici.model.domain.ItemEstoque;
import br.edu.infnet.rafaeldomenici.model.domain.Roupa;

@Component
public class ItemEstoqueLoader implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ItemEstoque item = new ItemEstoque(5,new Roupa(3,"Camisa Azul",'M',180,"Roupa Masculina"));
		System.out.println(item.getRoupa());
		System.out.println("Quantidade em estoque: "+item.getQuantidade());
		System.out.println("Valor total em estoque referente a este item: "+item.calcularTotalItem()+"\n");
		
	
		
		
	}

}
