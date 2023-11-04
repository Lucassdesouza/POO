import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Site implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int nextID = 1;

    private int id;
    private String descricao;
    private String url;
    private String dataCadastro;

    public Site(String descricao, String url, String dataCadastro) {
        this.id = nextID++;
        this.descricao = descricao;
        this.url = url;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nDescrição: " + descricao + "\nURL: " + url + "\nData de Cadastro: " + dataCadastro + "\n";
    }
}

public class CadastroDeSites {
    public static void main(String[] args) {
        List<Site> sites = new ArrayList<>();
        File dataFolder = new File("dados");
        dataFolder.mkdirs();

        // Carrega sites existentes
        List<Site> sitesLidos = carregarSites(dataFolder);

        // Inicializa o próximo ID com base nos sites existentes
        Site.nextID = sitesLidos.isEmpty() ? 1 : sitesLidos.get(sitesLidos.size() - 1).getId() + 1;

        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("1 - Cadastrar novo site");
            System.out.println("2 - Listar sites cadastrados");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Consumir a quebra de linha anterior
                    System.out.print("Descrição do site: ");
                    String descricao = scanner.nextLine();
                    System.out.print("URL: ");
                    String url = scanner.nextLine();
                    System.out.print("Data de cadastro: ");
                    String dataCadastro = scanner.nextLine();

                    Site site = new Site(descricao, url, dataCadastro);
                    sites.add(site);

                    // Salva o site em um arquivo binário
                    salvarSite(site, dataFolder);

                    System.out.println("Site cadastrado com sucesso! ID: " + site.getId());
                    break;
                case 2:
                    if (sitesLidos.isEmpty()) {
                        System.out.println("Nenhum site cadastrado ainda.");
                    } else {
                        System.out.println("Sites cadastrados:");
                        for (Site s : sitesLidos) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }

        scanner.close();
    }

    private static void salvarSite(Site site, File dataFolder) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(new File(dataFolder, site.getId() + ".data")))) {
            outputStream.writeObject(site);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Site> carregarSites(File dataFolder) {
        List<Site> sites = new ArrayList<>();
        File[] files = dataFolder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.getName().endsWith(".data")) {
                    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                        Site site = (Site) inputStream.readObject();
                        sites.add(site);
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return sites;
    }
}
