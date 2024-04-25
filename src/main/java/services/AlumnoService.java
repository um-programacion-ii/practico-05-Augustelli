package services;

import dao.AlumnoDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnoService implements DataBase<AlumnoDao> {

    static Map<Integer, AlumnoDao> dataBase = new HashMap<>();
    @Override
    public AlumnoDao find(int id) {
        AlumnoDao alumnoADevolver = dataBase.get(id);
        if (alumnoADevolver == null){
            return new AlumnoDao();
        }
        return  alumnoADevolver;
    }

    @Override
    public List<AlumnoDao> findAll() {
        ArrayList<AlumnoDao> listaADevolver = new ArrayList<>();
        for (int id : dataBase.keySet()){
            listaADevolver.add(dataBase.get(id));
        }
        return listaADevolver;
    }

    @Override
    public void insert(AlumnoDao register) {
         dataBase.put(dataBase.size() + 1 , register);
    }

    @Override
    public void update(AlumnoDao register, int id) throws Exception {
        if (dataBase.get(id) == null) {
            throw new Exception("No existe ese dato");
        }
        dataBase.put(id, register);
    }

    @Override
    public void delete(int id) throws Exception {
        if (dataBase.get(id) == null) {
            throw new Exception("No existe ese dato");
        }
        dataBase.remove(id);
    }
}
