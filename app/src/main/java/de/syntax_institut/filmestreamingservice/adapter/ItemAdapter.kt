package de.syntax_institut.filmestreamingservice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import de.syntax_institut.filmestreamingservice.R
import de.syntax_institut.filmestreamingservice.data.model.MovieTitle

/**
 * Der Item Adapter weist den views im ViewHolder den Inhalt zu
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<MovieTitle>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // TODO Schreibe hier deinen Code
        var recyclerText = itemView.findViewById<TextView>(R.id.filmtitle_textView)
    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        // das itemLayout wird zur ItemView aufgeblasen
        // TODO Schreibe hier deinen Code

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)


        // und in einem ViewHolder zurückgegeben
        //return TODO("Liefere das Ergebnis zurück")
        return ItemViewHolder(itemView)
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // Hole das movieTitle Objekt für die enthaltenen Informationen
        // TODO Schreibe hier deinen Code
        val item = dataset[position]

        // Hole die TextView aus dem ViewHolder
        // TODO Schreibe hier deinen Code
        val headerText = holder.recyclerText
        headerText.text = context.getString((item.stringResource))
        // Setze den Text
        // TODO Schreibe hier deinen Code


    }

    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return dataset.size
    }
}
