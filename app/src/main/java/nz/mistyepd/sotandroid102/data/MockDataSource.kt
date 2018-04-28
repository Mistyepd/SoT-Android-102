package nz.mistyepd.sotandroid102.data

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import nz.mistyepd.sotandroid102.data.models.Film


// TODO use the actual api, maybe https://ghibliapi.herokuapp.com/#section/Studio-Ghibli-API ?
// but it doesn't have images
class MockDataSource {
	
	fun getFilms() = _mockItems
	
	fun getFilm(id: String): Film? = _mockItems.find { it.id == id }
	
	
	private val filmsJson = "[{\n" +
			"    \"id\": \"2baf70d1-42bb-4437-b551-e5fed5a87abe\",\n" +
			"    \"title\": \"Castle in the Sky\",\n" +
			"    \"description\": \"The orphan Sheeta inherited a mysterious crystal that links her to the mythical sky-kingdom of Laputa. With the help of resourceful Pazu and a rollicking band of sky pirates, she makes her way to the ruins of the once-great civilization. Sheeta and Pazu must outwit the evil Muska, who plans to use Laputa's science to make himself ruler of the world.\",\n" +
			"    \"director\": \"Hayao Miyazaki\",\n" +
			"    \"producer\": \"Isao Takahata\",\n" +
			"    \"release_date\": \"1986\",\n" +
			"    \"rt_score\": \"95\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"id\": \"12cfb892-aac0-4c5b-94af-521852e46d6a\",\n" +
			"    \"title\": \"Grave of the Fireflies\",\n" +
			"    \"description\": \"In the latter part of World War II, a boy and his sister, orphaned when their mother is killed in the firebombing of Tokyo, are left to survive on their own in what remains of civilian life in Japan. The plot follows this boy and his sister as they do their best to survive in the Japanese countryside, battling hunger, prejudice, and pride in their own quiet, personal battle.\",\n" +
			"    \"director\": \"Isao Takahata\",\n" +
			"    \"producer\": \"Toru Hara\",\n" +
			"    \"release_date\": \"1988\",\n" +
			"    \"rt_score\": \"97\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/12cfb892-aac0-4c5b-94af-521852e46d6a\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"id\": \"58611129-2dbc-4a81-a72f-77ddfc1b1b49\",\n" +
			"    \"title\": \"My Neighbor Totoro\",\n" +
			"    \"description\": \"Two sisters move to the country with their father in order to be closer to their hospitalized mother, and discover the surrounding trees are inhabited by Totoros, magical spirits of the forest. When the youngest runs away from home, the older sister seeks help from the spirits to find her.\",\n" +
			"    \"director\": \"Hayao Miyazaki\",\n" +
			"    \"producer\": \"Hayao Miyazaki\",\n" +
			"    \"release_date\": \"1988\",\n" +
			"    \"rt_score\": \"93\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/986faac6-67e3-4fb8-a9ee-bad077c2e7fe\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/d5df3c04-f355-4038-833c-83bd3502b6b9\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/3031caa8-eb1a-41c6-ab93-dd091b541e11\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/87b68b97-3774-495b-bf80-495a5f3e672d\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/d39deecb-2bd0-4770-8b45-485f26e1381f\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/591524bc-04fe-4e60-8d61-2425e42ffb2a\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/c491755a-407d-4d6e-b58a-240ec78b5061\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/f467e18e-3694-409f-bdb3-be891ade1106\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/08ffbce4-7f94-476a-95bc-76d3c3969c19\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/0f8ef701-b4c7-4f15-bd15-368c7fe38d0a\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\",\n" +
			"      \"https://ghibliapi.herokuapp.com/species/603428ba-8a86-4b0b-a9f1-65df6abef3d3\",\n" +
			"      \"https://ghibliapi.herokuapp.com/species/74b7f547-1577-4430-806c-c358c8b6bcf5\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/58611129-2dbc-4a81-a72f-77ddfc1b1b49\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"id\": \"ea660b10-85c4-4ae3-8a5f-41cea3648e3e\",\n" +
			"    \"title\": \"Kiki's Delivery Service\",\n" +
			"    \"description\": \"A young witch, on her mandatory year of independent life, finds fitting into a new community difficult while she supports herself by running an air courier service.\",\n" +
			"    \"director\": \"Hayao Miyazaki\",\n" +
			"    \"producer\": \"Hayao Miyazaki\",\n" +
			"    \"release_date\": \"1989\",\n" +
			"    \"rt_score\": \"96\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/ea660b10-85c4-4ae3-8a5f-41cea3648e3e\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"id\": \"4e236f34-b981-41c3-8c65-f8c9000b94e7\",\n" +
			"    \"title\": \"Only Yesterday\",\n" +
			"    \"description\": \"It’s 1982, and Taeko is 27 years old, unmarried, and has lived her whole life in Tokyo. She decides to visit her family in the countryside, and as the train travels through the night, memories flood back of her younger years: the first immature stirrings of romance, the onset of puberty, and the frustrations of math and boys. At the station she is met by young farmer Toshio, and the encounters with him begin to reconnect her to forgotten longings. In lyrical switches between the present and the past, Taeko contemplates the arc of her life, and wonders if she has been true to the dreams of her childhood self.\",\n" +
			"    \"director\": \"Isao Takahata\",\n" +
			"    \"producer\": \"Toshio Suzuki\",\n" +
			"    \"release_date\": \"1991\",\n" +
			"    \"rt_score\": \"100\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/4e236f34-b981-41c3-8c65-f8c9000b94e7\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"id\": \"ebbb6b7c-945c-41ee-a792-de0e43191bd8\",\n" +
			"    \"title\": \"Porco Rosso\",\n" +
			"    \"description\": \"Porco Rosso, known in Japan as Crimson Pig (Kurenai no Buta) is the sixth animated film by Hayao Miyazaki and released in 1992. You're introduced to an Italian World War I fighter ace, now living as a freelance bounty hunter chasing 'air pirates' in the Adriatic Sea. He has been given a curse that changed his head to that of a pig. Once called Marco Pagot, he is now known to the world as 'Porco Rosso', Italian for 'Red Pig.'\",\n" +
			"    \"director\": \"Hayao Miyazaki\",\n" +
			"    \"producer\": \"Toshio Suzuki\",\n" +
			"    \"release_date\": \"1992\",\n" +
			"    \"rt_score\": \"94\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/ebbb6b7c-945c-41ee-a792-de0e43191bd8\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"id\": \"1b67aa9a-2e4a-45af-ac98-64d6ad15b16c\",\n" +
			"    \"title\": \"Pom Poko\",\n" +
			"    \"description\": \"As the human city development encroaches on the raccoon population's forest and meadow habitat, the raccoons find themselves faced with the very real possibility of extinction. In response, the raccoons engage in a desperate struggle to stop the construction and preserve their home.\",\n" +
			"    \"director\": \"Isao Takahata\",\n" +
			"    \"producer\": \"Toshio Suzuki\",\n" +
			"    \"release_date\": \"1994\",\n" +
			"    \"rt_score\": \"78\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/1b67aa9a-2e4a-45af-ac98-64d6ad15b16c\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"id\": \"ff24da26-a969-4f0e-ba1e-a122ead6c6e3\",\n" +
			"    \"title\": \"Whisper of the Heart\",\n" +
			"    \"description\": \"Shizuku lives a simple life, dominated by her love for stories and writing. One day she notices that all the library books she has have been previously checked out by the same person: 'Seiji Amasawa'. Curious as to who he is, Shizuku meets a boy her age whom she finds infuriating, but discovers to her shock that he is her 'Prince of Books'. As she grows closer to him, she realises that he merely read all those books to bring himself closer to her. The boy Seiji aspires to be a violin maker in Italy, and it is his dreams that make Shizuku realise that she has no clear path for her life. Knowing that her strength lies in writing, she tests her talents by writing a story about Baron, a cat statuette belonging to Seiji's grandfather.\",\n" +
			"    \"director\": \"Yoshifumi Kondō\",\n" +
			"    \"producer\": \"Toshio Suzuki\",\n" +
			"    \"release_date\": \"1995\",\n" +
			"    \"rt_score\": \"91\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/ff24da26-a969-4f0e-ba1e-a122ead6c6e3\"\n" +
			"  },\n" +
			"  {\n" +
			"    \"id\": \"0440483e-ca0e-4120-8c50-4c8cd9b965d6\",\n" +
			"    \"title\": \"Princess Mononoke\",\n" +
			"    \"description\": \"Ashitaka, a prince of the disappearing Ainu tribe, is cursed by a demonized boar god and must journey to the west to find a cure. Along the way, he encounters San, a young human woman fighting to protect the forest, and Lady Eboshi, who is trying to destroy it. Ashitaka must find a way to bring balance to this conflict.\",\n" +
			"    \"director\": \"Hayao Miyazaki\",\n" +
			"    \"producer\": \"Toshio Suzuki\",\n" +
			"    \"release_date\": \"1997\",\n" +
			"    \"rt_score\": \"92\",\n" +
			"    \"people\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/people/ba924631-068e-4436-b6de-f3283fa848f0\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/ebe40383-aad2-4208-90ab-698f00c581ab\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/030555b3-4c92-4fce-93fb-e70c3ae3df8b\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/ca568e87-4ce2-4afa-a6c5-51f4ae80a60b\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/e9356bb5-4d4a-4c93-aadc-c83e514bffe3\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/34277bec-7401-43fa-a00a-5aee64b45b08\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/91939012-90b9-46e5-a649-96b898073c82\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/20e3bd33-b35d-41e6-83a4-57ca7f028d38\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/8bccdc78-545b-49f4-a4c8-756163a38c91\",\n" +
			"      \"https://ghibliapi.herokuapp.com/people/116bfe1b-3ba8-4fa0-8f72-88537a493cb9\"\n" +
			"    ],\n" +
			"    \"species\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2\",\n" +
			"      \"https://ghibliapi.herokuapp.com/species/6bc92fdd-b0f4-4286-ad71-1f99fb4a0d1e\",\n" +
			"      \"https://ghibliapi.herokuapp.com/species/f25fa661-3073-414d-968a-ab062e3065f7\"\n" +
			"    ],\n" +
			"    \"locations\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/locations/\"\n" +
			"    ],\n" +
			"    \"vehicles\": [\n" +
			"      \"https://ghibliapi.herokuapp.com/vehicles/\"\n" +
			"    ],\n" +
			"    \"url\": \"https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6\"\n" +
			"  }]"
	
	private val _mockItems = Gson().fromJson<List<Film>>(filmsJson, object : TypeToken<List<Film>>() {}.getType())
	
}