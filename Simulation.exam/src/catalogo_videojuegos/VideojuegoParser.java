package catalogo_videojuegos;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.*;
import java.util.regex.*;

public class VideojuegoParser {
    public static List<Videojuego> parseXML(String ruta) {
        List<Videojuego> lista = new ArrayList<>();
        try {
            File archivo = new File(ruta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc;
            doc = dBuilder.parse(archivo);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("videojuego");

            for (int i = 0; i < nList.getLength(); i++) {
                Element elem = (Element) nList.item(i);
                String id = elem.getAttribute("id");
                String titulo = getTagValue(elem, "titulo");
                String desarrollador = getTagValue(elem, "desarrollador");
                String lanzamiento = getTagValue(elem, "lanzamiento");
                String plataforma = getTagValue(elem, "plataforma");
                String genero = getTagValue(elem, "genero");
                String descripcion = getTagValue(elem, "descripcion");

                if (id.isEmpty() || titulo == null) {
                    System.out.println("AVISO: Videojuego sin ID o título omitido.");
                    continue;
                }

                String pegi = "No disponible";
                if (descripcion != null) {
                    Matcher m = Pattern.compile("PEGI:?\\s*(\\d+)", Pattern.CASE_INSENSITIVE).matcher(descripcion);
                    if (m.find()) {
                        pegi = m.group(1);
                    }
                }

                Videojuego vj = new Videojuego();
                vj.setId(id);
                vj.setTitulo(titulo);
                vj.setDesarrollador(desarrollador);
                vj.setLanzamiento(lanzamiento);
                vj.setPlataforma(plataforma);
                vj.setGenero(genero);
                vj.setDescripcion(descripcion != null ? descripcion : "No disponible.");
                vj.setPegi(pegi);

                lista.add(vj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    private static String getTagValue(Element elem, String tag) {
        NodeList nodeList = elem.getElementsByTagName(tag);
        if (nodeList.getLength() == 0) return null;
        return nodeList.item(0).getTextContent().trim();
    }
}
