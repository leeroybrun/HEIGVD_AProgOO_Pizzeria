package Lib;

import java.util.ArrayList;
import java.util.List;

public final class Pizza extends Article {
	public enum TaillePizza {
		Petite(1),
        Moyenne(2),
        Grande(4)
	};
	
	private final List<Ingredient> _ingredients = new ArrayList<Ingredient>();
	
	public Pizza(String designation, double prixHT, List<Ingredient> ingredients, TaillePizza taille) throws Exception {
		super(designation, prixHT);
	}
	
	@Override
	public double calculerPrixHT() {
		return getPrixHT();
	}
}

/*

public sealed class Pizza : Article
    {
        private readonly List<Ingredient> _ingredients = new List<Ingredient>();

        public Pizza(string designation, decimal prixHT, List<Ingredient> ingredients, TaillePizza taille) : base(designation, prixHT)
        {
            if (ingredients == null || ingredients.Count == 0)
            {
                throw new ArgumentNullException("ingredients", "La liste des ingredients de la pizza ne contient aucun élément.");
            }
            _ingredients.AddRange(ingredients);
            Taille = taille;
        }

        public void Ajouter(Ingredient ingredient)
        {
            if (ingredient != null)
            {
                if (!_ingredients.Contains(ingredient))
                {
                    _ingredients.Add(ingredient);
                }
            }
        }

        public void Retirer(Ingredient ingredient)
        {
            if (ingredient != null)
            {
                if (_ingredients.Contains(ingredient))
                {
                    _ingredients.Remove(ingredient);
                }
            }
        }

        public List<Ingredient> ObtenirIngredients()
        {
            return new List<Ingredient>(_ingredients);
        }

        public override decimal CalculerPrixHT()
        {
            decimal prix = PrixHT;

            foreach (var ingredient in _ingredients)
            {
                prix += (ingredient.CalculerPrixHT() * (int)Taille);
            }

            return prix;
        }

        public TaillePizza Taille { get; set; }

    }

    public enum TaillePizza
    {
        Petite  = 1,
        Moyenne = 2,
        Grande  = 4
    }

*/